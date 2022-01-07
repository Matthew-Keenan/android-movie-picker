package com.example.moviepicker


import com.google.gson.annotations.SerializedName
import java.security.Provider

data class MovieSearchData(

    @SerializedName("genre_ids")
    val genreIds: List<Int>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("vote_average")
    val voteAverage: Double,
    @SerializedName("runtime")
    val runtime: Int,
    @SerializedName("genres")
    val genres: List<Genres>,
    @SerializedName("results")
    val countries: List<Countries>
)

data class Genres(
    @SerializedName("id")
    val genreId: Int
)

data class Countries(
    @SerializedName("US")
    val usData: List<StreamTypes>
)

data class StreamTypes(
    @SerializedName("flatrate")
    val streamData: List<Providers>
)

data class Providers(
    @SerializedName("provider_name")
    val providers: String
)
