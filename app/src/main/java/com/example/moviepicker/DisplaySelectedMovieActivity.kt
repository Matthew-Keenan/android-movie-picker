package com.example.moviepicker

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.google.gson.Gson
import com.koushikdutta.ion.Ion
import com.squareup.picasso.Picasso
import kotlin.collections.ArrayList
import kotlin.random.Random

class DisplaySelectedMovieActivity: AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    val providerLinkMap = mutableMapOf<String, String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.selected_movie_layout)

        navigationSetup()
        title = null

        val myDB = DatabaseHelper(this)

        val intent = intent
        var minLength = 0
        var maxLength = 0

        if(intent.getStringExtra("length") == "Under 90 Minutes"){
            minLength = 1
            maxLength = 89
        }
        else if(intent.getStringExtra("length") == "90 to 120 Minutes"){
            minLength = 90
            maxLength = 120
        }
        else if(intent.getStringExtra("length") == "120+ Minutes"){
            minLength = 121
            maxLength = 10000
        }
        else{
            minLength = 0
            maxLength = 0
        }

        var selectedGenre: String? = if(intent.getStringExtra("genre") != null){
            intent.getStringExtra("genre")
        } else{
            ""
        }

        var selectedPlatform: String? = if(intent.getStringExtra("platform") != null){
            intent.getStringExtra("platform")
        } else{
            ""
        }

        val filteredWatchlist = getFilteredWatchlist(minLength, maxLength, selectedGenre, selectedPlatform, myDB)
        if(filteredWatchlist.size > 0){
            pickMovie(filteredWatchlist)
        }
        else{
            loadNullMovie()
        }

    }

    fun getFilteredWatchlist(minLength: Int, maxLength: Int, genre: String?, platform: String?, myDB: DatabaseHelper): ArrayList<MovieSearchData>{

        var watchlistIds = myDB.getWatchlist()
        var watchlist = ArrayList<MovieSearchData>()
        var movieChoices = ArrayList<MovieSearchData>()

        for(movieId in watchlistIds){
            var movie = ActMainRecyclerAdapter(this).getMovie(movieId)
            watchlist.add(movie)
        }

        if(platform == "" && genre == "" && minLength == 0){
            for(movie in watchlist){
                movieChoices.add(movie)
            }
        }
        else if(platform == "" && genre == ""){

            for(movie in watchlist){
                if (movie.runtime in minLength..maxLength){
                    movieChoices.add(movie)
                }
            }

        }
        else if(platform == "" && minLength == 0){

            for(movie in watchlist){
                for(genreId in movie.genres){
                    if (myDB.getGenre(genreId.genreId) == genre){
                        movieChoices.add(movie)
                        break
                    }
                }
            }

        }
        else if(platform == ""){

            for(movie in watchlist){
                for(genreId in movie.genres){
                    if ( (myDB.getGenre(genreId.genreId) == genre) && (movie.runtime in minLength..maxLength) ){
                        movieChoices.add(movie)
                        break
                    }
                }
            }

        }
        else if(genre == "" && minLength == 0){

            for(movie in watchlist){
                var platforms = getMovieProviders(movie.id)
                for (moviePlatform in platforms){
                    if (moviePlatform == platform){
                        movieChoices.add(movie)
                        break
                    }
                }
            }

        }
        else if(genre == "")
        {

            for(movie in watchlist){
                var platforms = getMovieProviders(movie.id)
                for (moviePlatform in platforms){
                    if ( (moviePlatform == platform) && (movie.runtime in minLength..maxLength) ){
                        movieChoices.add(movie)
                        break
                    }
                }
            }

        }
        else if(minLength == 0){
            var streamBool = false
            var genreBool = false

            for (movie in watchlist){

                var platforms = getMovieProviders(movie.id)
                for (moviePlatform in platforms){
                    if (moviePlatform == platform){
                        streamBool = true
                        break
                    }
                }

                for(genreId in movie.genres){
                    if ( (myDB.getGenre(genreId.genreId) == genre) && (movie.runtime in minLength..maxLength) ){
                        genreBool = true
                        break
                    }
                }

                if(streamBool && genreBool){
                    movieChoices.add(movie)
                }

            }

        }
        else{

            for (movie in watchlist){

                var streamBool = false
                var genreBool = false
                var timeBool = false

                var platforms = getMovieProviders(movie.id)
                for (moviePlatform in platforms){
                    if (moviePlatform == platform){
                        streamBool = true
                        break
                    }
                }

                for(genreId in movie.genres){
                    if (myDB.getGenre(genreId.genreId) == genre){
                        genreBool = true
                        break
                    }
                }

                if(movie.runtime in minLength..maxLength){
                    timeBool = true
                }

                if(streamBool && genreBool && timeBool){
                    movieChoices.add(movie)
                }

            }
        }

        return movieChoices
    }

    fun getMovieProviders(movieId: Int): ArrayList<String>{

        var streamProviders = ArrayList<String>()

        var url = "https://api.themoviedb.org/3/movie/${movieId}/watch/providers?api_key=a8bc6a880f40d7aa5123b5354b6c77a7"

        val rawJsonResponse = Ion.with(this)
            .load(url)
            .asJsonObject()
            .get()

        val data = Gson().fromJson(rawJsonResponse, StreamProviderData::class.java)

        for (result in data.results.uS.flatrate){
            streamProviders.add(result.providerName)
        }

        return streamProviders
    }

    fun pickMovie(filteredWatchlist: ArrayList<MovieSearchData>) {

        var randomIndex = Random.nextInt(0, filteredWatchlist.size)
        var randomMovie = filteredWatchlist[randomIndex]
        loadMovie(randomMovie)

    }

    fun loadMovie(movie: MovieSearchData){
        val title = movie.title
        val description = movie.overview
        val length = movie.runtime.toString() + " minutes"
        val rating = movie.voteAverage.toString()
        val genres = ActMainRecyclerAdapter(this)
            .getGenres(movie)
            .toString()
            .replace("[", "").replace("]", "")
        val posterUrl = "https://image.tmdb.org/t/p/w185/" + movie.posterPath

        val titleHolder = findViewById<TextView>(R.id.selected_movie_title)
        val descriptionHolder = findViewById<TextView>(R.id.selected_movie_description)
        val lengthHolder = findViewById<TextView>(R.id.selected_movie_length)
        val ratingHolder = findViewById<TextView>(R.id.selected_movie_rating)
        val genresHolder = findViewById<TextView>(R.id.selected_movie_genres)
        val posterHolder = findViewById<ImageView>(R.id.selected_movie_poster)

        titleHolder.text = title
        descriptionHolder.text = description
        lengthHolder.text = length
        ratingHolder.text = rating
        genresHolder.text = genres
        Picasso.get().load(posterUrl).error(R.drawable.error_poster).into(posterHolder)

        val providerButton1 = findViewById<Button>(R.id.platform_button_1)

        val moviesProviders = getMovieProviders(movie.id)
        val allProviders = ArrayList<String>()
        allProviders.add("Netflix")
        allProviders.add("Amazon Prime Video")
        allProviders.add("Disney Plus")
        allProviders.add("Apple iTunes")
        allProviders.add("Google Play Movies")
        allProviders.add("Hulu")
        allProviders.add("Paramount Plus")
        allProviders.add("fuboTV")
        allProviders.add("HBO Max")
        allProviders.add("Peacock")
        val filteredProviders = ArrayList<String>()
        for(provider in moviesProviders){
            for(possibleProvider in allProviders){
                if (provider == possibleProvider){
                    filteredProviders.add(provider)
                }
            }
        }

        if(filteredProviders.size > 0){
            providerButton1.text = filteredProviders[0]
        }
        else{
            providerButton1.text = "No Platforms"
        }

        providerLinkMap["Netflix"] = "https://www.netflix.com/"
        providerLinkMap["Amazon Prime Video"] = "https://www.primevideo.com"
        providerLinkMap["Disney Plus"] = "https://www.disneyplus.com"
        providerLinkMap["Apple iTunes"] = "https://www.apple.com/itunes/"
        providerLinkMap["Google Play Movies"] = "https://play.google.com/store"
        providerLinkMap["Hulu"] = "https://www.hulu.com/welcome"
        providerLinkMap["Paramount Plus"] = "https://www.paramountplus.com"
        providerLinkMap["fuboTV"] = "https://www.fubo.tv"
        providerLinkMap["HBO Max"] = "https://www.hbomax.com"
        providerLinkMap["Peacock"] = "https://www.peacocktv.com"


        var providerLink = if(filteredProviders.size > 0){
            providerLinkMap[filteredProviders[0]].toString()
        } else{
            "None"
        }

        providerButton1.setOnClickListener {
            if(filteredProviders.size > 0){
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(providerLink))
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "No Streaming Platform", Toast.LENGTH_SHORT).show()
            }
        }

        val topThreeRecommended = getRecommended(movie)

        val movieRecOnePosterHolder = findViewById<ImageView>(R.id.movie_rec_1)
        val poster1Url = "https://image.tmdb.org/t/p/w185/" + topThreeRecommended[0].posterPath
        Picasso.get().load(poster1Url).error(R.drawable.error_poster).into(movieRecOnePosterHolder)
        movieRecOnePosterHolder.setOnClickListener {
            Toast.makeText(this, topThreeRecommended[0].title, Toast.LENGTH_SHORT).show()
        }

        val movieRecTwoPosterHolder = findViewById<ImageView>(R.id.movie_rec_2)
        val poster2Url = "https://image.tmdb.org/t/p/w185/" + topThreeRecommended[1].posterPath
        Picasso.get().load(poster2Url).error(R.drawable.error_poster).into(movieRecTwoPosterHolder)
        movieRecTwoPosterHolder.setOnClickListener {
            Toast.makeText(this, topThreeRecommended[1].title, Toast.LENGTH_SHORT).show()
        }

        val movieRecThreePosterHolder = findViewById<ImageView>(R.id.movie_rec_3)
        val poster3Url = "https://image.tmdb.org/t/p/w185/" + topThreeRecommended[2].posterPath
        Picasso.get().load(poster3Url).error(R.drawable.error_poster).into(movieRecThreePosterHolder)
        movieRecThreePosterHolder.setOnClickListener {
            Toast.makeText(this, topThreeRecommended[2].title, Toast.LENGTH_SHORT).show()
        }

    }

    fun loadNullMovie(){
        val titleHolder = findViewById<TextView>(R.id.selected_movie_title)
        val posterHolder = findViewById<ImageView>(R.id.selected_movie_poster)

        titleHolder.text = "No Movies Match Parameters"
        posterHolder.setImageResource(R.drawable.error_poster)
    }

    fun navigationSetup(){
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        val toolbar = drawerLayout.findViewById<Toolbar>(R.id.navToolbar)
        val navigate = drawerLayout.findViewById<NavigationView>(R.id.navi)
        setSupportActionBar(toolbar)
        val drawer = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        drawer.syncState()
        navigate.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        when (item.itemId) {
            R.id.movie_list_nav -> {
                val intent = Intent(this, MovieFragDisplay::class.java)
                startActivity(intent)
                drawerLayout.closeDrawer(Gravity.LEFT)
            }

            R.id.how_to_nav -> {
                val intent = Intent(this, HowToActivity::class.java)
                startActivity(intent)
                drawerLayout.closeDrawer(Gravity.LEFT)
            }

            R.id.home_nav -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                drawerLayout.closeDrawer(Gravity.LEFT)
            }
        }

        return true
    }

    fun getRecommended(movie:MovieSearchData): ArrayList<MovieSearchData>{
        var recommendedMovies = ArrayList<MovieSearchData>()

        val movieId = movie.id
        var url = "https://api.themoviedb.org/3/movie/${movieId}/similar?api_key=a8bc6a880f40d7aa5123b5354b6c77a7&language=en-US&page=1"

        val rawJsonResponse = Ion.with(this)
            .load(url)
            .asJsonObject()
            .get()["results"]

        val data = Gson().fromJson(rawJsonResponse, Array<MovieSearchData>::class.java).toList()
        recommendedMovies.add(data[0])
        recommendedMovies.add(data[1])
        recommendedMovies.add(data[2])


        return recommendedMovies
    }
}