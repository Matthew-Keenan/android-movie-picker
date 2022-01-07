package com.example.moviepicker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.google.gson.Gson
import com.koushikdutta.ion.Ion
import com.squareup.picasso.Picasso
import kotlin.collections.ArrayList

class ActMainRecyclerAdapter(val context: Context): androidx.recyclerview.widget.RecyclerView.Adapter<ActMainRecyclerAdapter.ViewHolder>() {

    val myDB = DatabaseHelper(context)
    var movieIds: ArrayList<Int>
    var movies = ArrayList<MovieSearchData>()
    init {
        myDB.initTables()
        movieIds = myDB.getWatchlist()

        for(movieId in movieIds){
            var movie = getMovie(movieId)
            movies.add(movie)
        }

    }

    inner class ViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
        val poster = itemView.findViewById(R.id.act_main_recycle_poster) as ImageView
        val title = itemView.findViewById(R.id.act_main_recycle_title) as TextView
        val time = itemView.findViewById(R.id.act_main_recycle_time) as TextView
        val genres = itemView.findViewById(R.id.act_main_recycle_genres) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        return ViewHolder(inflater.inflate(R.layout.act_main_recycle_card, parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.title.text = movies[position].title
        holder.poster.setImageResource(R.drawable.error_poster)
        holder.time.text = movies[position].runtime.toString() + " minutes"

        val posterUrl = "https://image.tmdb.org/t/p/w185/" + movies[position].posterPath
        Picasso.get().load(posterUrl).error(R.drawable.error_poster).into(holder.poster)

        val genres = getGenres(movies[position]).toString().replace("[", "").replace("]", "")
        holder.genres.text = genres

    }

    override fun getItemCount(): Int {
        return movies.size
    }

    fun getMovie(movie_id: Int): MovieSearchData {
        var url =
            "https://api.themoviedb.org/3/movie/${movie_id}?api_key=a8bc6a880f40d7aa5123b5354b6c77a7&language=en-US"

        val rawJsonResponse = Ion.with(context)
            .load(url)
            .asJsonObject()
            .get()

        return Gson().fromJson(rawJsonResponse, MovieSearchData::class.java)
    }

    fun getGenres(movie: MovieSearchData): ArrayList<String>{
        val genreArrayList = ArrayList<String>()
        for (movieGenre in movie.genres){
            val genre = myDB.getGenre(movieGenre.genreId)
            genreArrayList.add(genre)
        }
        return genreArrayList
    }

    fun returnMovies(): ArrayList<MovieSearchData>{
        return movies
    }

}
