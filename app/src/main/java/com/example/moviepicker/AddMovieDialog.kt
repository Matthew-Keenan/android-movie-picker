package com.example.moviepicker

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.SearchView
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.koushikdutta.ion.Ion
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class AddMovieDialog: DialogFragment() {
    lateinit var fullQuery: String
    lateinit var movieData: List<MovieSearchData>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_add_movie, container)
        this.dialog?.setTitle("Add Movie")

        val cancelBtn = view.findViewById<Button>(R.id.cancel_add_btn)
        cancelBtn.setOnClickListener{
            this.dismiss()
        }

        val searchButton = view.findViewById<Button>(R.id.search_add_movie)
        val searchBox = view.findViewById<SearchView>(R.id.movie_search)
        searchButton.setOnClickListener {
            var searchInput = searchBox.query.toString()
            movieData = searchRequest(searchInput)
            val searchRecyclerView = view.findViewById<RecyclerView>(R.id.search_recycleview)
            searchRecyclerView.layoutManager = LinearLayoutManager(MainActivity())
            val searchResultsRecyclerAdapter = SearchResultsRecyclerAdapter(MainActivity(), movieData)
            searchRecyclerView.adapter = searchResultsRecyclerAdapter
        }

        return view
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setCancelable(false)
        dialog.setCanceledOnTouchOutside(false)

        return dialog
    }

    fun searchRequest(raw_query: String): List<MovieSearchData>{
        fullQuery = raw_query.replace(" ", "%20")
        var url = "https://api.themoviedb.org/3/search/movie?" +
                "api_key=a8bc6a880f40d7aa5123b5354b6c77a7&language=en-US&" +
                "query=${fullQuery}&page=1&include_adult=false"

        val rawJsonResponse = Ion.with(context)
            .load(url)
            .asJsonObject()
            .get()["results"]

        return Gson().fromJson(rawJsonResponse, Array<MovieSearchData>::class.java).asList()
    }

}
