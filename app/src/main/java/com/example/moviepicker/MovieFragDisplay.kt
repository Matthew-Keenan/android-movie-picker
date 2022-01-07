package com.example.moviepicker

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.viewpager.widget.ViewPager
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout

class MovieFragDisplay : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.watchlist_layout)

        navigationSetup()
        title = null

        val movieViewPager = findViewById<ViewPager>(R.id.watchlist_viewpager)
        movieViewPager.adapter = WatchlistPagerAdapter(this, supportFragmentManager)

        val movieTabLayout = findViewById<TabLayout>(R.id.watchlist_tabs)
        movieTabLayout.setupWithViewPager(movieViewPager)

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