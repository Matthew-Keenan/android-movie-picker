package com.example.moviepicker

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.fragment.app.DialogFragment

class PickMovieDialog: DialogFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val moviePick = inflater.inflate(R.layout.fragment_pick_movie_details, container)
        this.dialog?.setTitle("Pick Movie")

        val contButton = moviePick.findViewById<Button>(R.id.continue_to_selection_id)
        contButton.setOnClickListener{
            val intent = Intent(activity, DisplaySelectedMovieActivity::class.java)
            startActivity(intent)
        }
        val cancelBtn = moviePick.findViewById<Button>(R.id.pick_cancel_button)
        cancelBtn.setOnClickListener{
            this.dismiss()
        }

        var lengthArray: Array<String> = resources.getStringArray(R.array.length_array)
        var lengthAdapter = context?.let {
            ArrayAdapter(
                it,
                android.R.layout.simple_list_item_1,
                lengthArray
            )
        }
        var lengthSpinner = moviePick.findViewById<Spinner>(R.id.length_spinner)
        lengthSpinner.adapter = lengthAdapter

        var genreArray: Array<String> = resources.getStringArray(R.array.genres_array)
        var genreAdapter = context?.let {
            ArrayAdapter(
                it,
                android.R.layout.simple_list_item_1,
                genreArray
            )
        }
        var genreSpinner = moviePick.findViewById<Spinner>(R.id.genre_spinner)
        genreSpinner.adapter = genreAdapter

        var streamingArray: Array<String> = resources.getStringArray(R.array.streaming_array)
        var streamingAdapter = context?.let {
            ArrayAdapter(
                it,
                android.R.layout.simple_list_item_1,
                streamingArray
            )
        }
        var streamingSpinner = moviePick.findViewById<Spinner>(R.id.platform_spinner)
        streamingSpinner.adapter = streamingAdapter

        val continueButton = moviePick.findViewById<Button>(R.id.continue_to_selection_id)
        continueButton.setOnClickListener {
            makeSelection(lengthSpinner, genreSpinner, streamingSpinner)
        }

        return moviePick
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setCancelable(false)
        dialog.setCanceledOnTouchOutside(false)

        return dialog
    }

    private fun makeSelection(lengthSpinner: Spinner, genreSpinner: Spinner, streamingSpinner: Spinner) {
        var lengthInput = lengthSpinner.selectedItem
        var genreInput = genreSpinner.selectedItem
        var streamingInput = streamingSpinner.selectedItem

        val intent = Intent(context, DisplaySelectedMovieActivity::class.java)
        intent.putExtra("length", lengthInput.toString())
        intent.putExtra("genre", genreInput.toString())
        intent.putExtra("platform", streamingInput.toString())
        startActivity(intent)
    }
}