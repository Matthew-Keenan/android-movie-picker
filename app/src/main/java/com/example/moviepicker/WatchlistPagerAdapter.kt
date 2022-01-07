package com.example.moviepicker

import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.google.gson.Gson
import com.koushikdutta.ion.Ion

class WatchlistPagerAdapter(context: Context, fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {

    val myDB = DatabaseHelper(context)
    var movieIds: ArrayList<Int>
    var movies = ArrayList<MovieSearchData>()
    init {
        myDB.initTables()
        movieIds = myDB.getWatchlist()

        for(movieId in movieIds){
            var movie = getMovie(context, movieId)
            movies.add(movie)
        }

    }

    override fun getItemPosition(`object`: Any): Int {
        return super.getItemPosition(`object`)
    }

    override fun getCount(): Int {
        return movies.size
    }

    override fun getItem(page: Int): Fragment {
       return Movies(movies[page], page)
    }

    override fun getPageTitle(page: Int): CharSequence? {
        when(page){
            page -> {
                return movies[page].title
            }
        }
        return super.getPageTitle(page)
    }

    fun getMovie(context: Context, movie_id: Int): MovieSearchData {
        var url =
            "https://api.themoviedb.org/3/movie/${movie_id}?api_key=a8bc6a880f40d7aa5123b5354b6c77a7&language=en-US"

        val rawJsonResponse = Ion.with(context)
            .load(url)
            .asJsonObject()
            .get()

        return Gson().fromJson(rawJsonResponse, MovieSearchData::class.java)
    }


}