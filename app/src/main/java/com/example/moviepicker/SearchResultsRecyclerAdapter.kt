package com.example.moviepicker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.squareup.picasso.Picasso

class SearchResultsRecyclerAdapter(context: Context, val movieData: List<MovieSearchData>): androidx.recyclerview.widget.RecyclerView.Adapter<SearchResultsRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
        val title = itemView.findViewById(R.id.search_result_recycle_title) as TextView
        val poster = itemView.findViewById(R.id.search_result_recycle_poster) as ImageView
        val description = itemView.findViewById(R.id.search_result_recycle_description) as TextView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        return ViewHolder(inflater.inflate(R.layout.search_result_recycle_card, parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if (movieData == null){
            holder.title.text = "ERROR: No Title Given"
            holder.poster.setImageResource(R.drawable.error_poster)
            holder.description.text = "ERROR: No Description Given"

            holder.poster.setOnClickListener {

                Toast.makeText(holder.poster.context, "You added ERROR to your watchlist!", Toast.LENGTH_SHORT).show()

            }
        }
        else{
            holder.title.text = movieData[position].title
            holder.description.text = movieData[position].overview

            val posterUrl = "https://image.tmdb.org/t/p/w185/" + movieData[position].posterPath
            Picasso.get().load(posterUrl).error(R.drawable.error_poster).into(holder.poster)

            holder.poster.setOnClickListener {
                val myDB = DatabaseHelper(holder.poster.context)
                myDB.insertMovie(movieData[position].id)
                val movies = ActMainRecyclerAdapter(holder.poster.context).returnMovies()
                ActMainRecyclerAdapter(holder.poster.context).notifyItemInserted(movies.size)
                ActMainRecyclerAdapter(holder.poster.context).notifyItemRangeChanged(0, movies.size)
                Toast.makeText(holder.poster.context, "You added ${holder.title.text} to your watchlist!", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun getItemCount(): Int {
        return movieData.size
    }
}