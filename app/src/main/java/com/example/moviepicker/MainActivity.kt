package com.example.moviepicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationSetup()
        title = null

        val fm = supportFragmentManager

        val pickMovieButton: Button = findViewById(R.id.start_pick_btn)
        val pickMovieFragment = PickMovieDialog()
        pickMovieButton.setOnClickListener { pickMovieFragment.show(fm, "PickMovie_tag") }

        val addMovieButton: FloatingActionButton = findViewById(R.id.addMovieButton)
        val addMovieFragment = AddMovieDialog()
        addMovieButton.setOnClickListener { addMovieFragment.show(fm, "AddMovie_tag") }

        val actMainRecyclerView = findViewById<RecyclerView>(R.id.actMainRecycle)
        actMainRecyclerView.layoutManager = LinearLayoutManager(this)

        val actMainRecyclerAdapter = ActMainRecyclerAdapter(this)
        actMainRecyclerView.adapter = actMainRecyclerAdapter
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

}