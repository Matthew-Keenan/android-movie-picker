package com.example.moviepicker

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context): SQLiteOpenHelper(context, MOVIE_DB, null, DB_VERSION) {

    private val genreMap = mapOf(
        28 to "Action",
        12 to "Adventure",
        16 to "Animation",
        35 to "Comedy",
        80 to "Crime",
        99 to "Documentary",
        18 to "Drama",
        10751 to "Family",
        14 to "Fantasy",
        36 to "History",
        27 to "Horror",
        10402 to "Music",
        9648 to "Mystery",
        10749 to "Romance",
        878 to "Science Fiction",
        10770 to "TV Movie",
        53 to "Thriller",
        10752 to "War",
        37 to "Western"
    )

    companion object {
        private val MOVIE_DB = "movies.db"
        private val DB_VERSION = 1

        private val COL_ID = "id"

        private val COL_GENRE = "genre_name"
        private val COL_MOVIE_ID = "movie_id"
        private val COL_GENRE_ID = "genre_id"

        private val CREATE_TABLE_WATCHLIST = "CREATE TABLE IF NOT EXISTS watchlist " +
                "( $COL_ID INTEGER PRIMARY KEY, $COL_MOVIE_ID INTEGER )"

        private val CREATE_TABLE_GENRES = "CREATE TABLE IF NOT EXISTS genres ( $COL_GENRE_ID INTEGER, $COL_GENRE TEXT )"

        private val DROP_TABLE_WATCHLIST = "DROP TABLE IF EXISTS watchlist"
        private val DROP_TABLE_GENRES = "DROP TABLE IF EXISTS genres"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(CREATE_TABLE_WATCHLIST)
        db?.execSQL(CREATE_TABLE_GENRES)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL(DROP_TABLE_WATCHLIST)
        db?.execSQL(DROP_TABLE_GENRES)
    }

    fun initTables(){
        val db = this.readableDatabase
        var query = "SELECT * FROM genres"
        var c = db.rawQuery(query, null)
        if( c.count <= 0){
            insertAllGenres()
        }

        query = "SELECT * FROM watchlist"
        c = db.rawQuery(query, null)
        val count = c.count
        if( c.count <= 0) {
            insertMovie(24428)
        }
    }

    fun insertMovie(movie_id: Int): Long{
        val db = this.writableDatabase

        val values = ContentValues()
        values.put(COL_MOVIE_ID, movie_id)

        return db.insert("watchlist", null, values)
    }

    private fun insertAllGenres() {
        for( (key, value) in genreMap){
            addGenre(key, value)
        }
    }

    fun addGenre(genre_id: Int, genre_string: String): Long{
        val db = this.writableDatabase

        val values = ContentValues()
        values.put(COL_GENRE_ID, genre_id)
        values.put(COL_GENRE, genre_string)
        return db.insert("genres", null, values)
    }

    fun getWatchlist(): ArrayList<Int>{
        val movieList: ArrayList<Int> = ArrayList()
        val query = "SELECT movie_id FROM watchlist"
        val db = this.readableDatabase

        val c = db.rawQuery(query, null)
        if(c.moveToFirst()){
            do{
                var movie_id = c.getInt(c.getColumnIndexOrThrow(COL_MOVIE_ID))
                movieList.add(movie_id)
            }while(c.moveToNext())
        }

        return movieList
    }

    fun getGenre(genreId: Int): String{
        val query = "SELECT genre_name FROM genres WHERE genre_id = $genreId"
        val db = this.readableDatabase

        val c = db.rawQuery(query, null)
        c.moveToFirst()
        val genre = c.getString(c.getColumnIndexOrThrow(COL_GENRE))

        return genre
    }

}