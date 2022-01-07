package com.example.moviepicker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import com.squareup.picasso.Picasso

class Movies(movie:MovieSearchData, index: Int) : androidx.fragment.app.Fragment() {

    val movie = movie
    var index = index

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view =  inflater.inflate(R.layout.watchlist_movie_fragment, container, false)

        val posterHolder = view.findViewById(R.id.poster) as ImageView
        val titleHolder = view.findViewById(R.id.movTitle) as TextView
        val lengthHolder = view.findViewById(R.id.length) as TextView
        val genreHolder = view.findViewById(R.id.genre) as TextView
        val ratingHolder = view.findViewById(R.id.rating) as TextView
        val descriptionHolder = view.findViewById(R.id.description) as TextView

        val posterUrl = "https://image.tmdb.org/t/p/w185/" + movie.posterPath
        Picasso.get().load(posterUrl).error(R.drawable.error_poster).into(posterHolder)

        titleHolder.text = movie.title
        lengthHolder.text = movie.runtime.toString() + " minutes"
        genreHolder.text = ActMainRecyclerAdapter(genreHolder.context)
            .getGenres(movie)
            .toString()
            .replace("[", "").replace("]", "")
        ratingHolder.text = movie.voteAverage.toString()
        descriptionHolder.text = movie.overview

        return view

    }

}