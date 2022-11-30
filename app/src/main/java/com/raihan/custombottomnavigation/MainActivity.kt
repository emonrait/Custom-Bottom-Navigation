package com.raihan.custombottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.raihan.custombottomnavigation.adaptar.ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    //private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var main_view_pager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        main_view_pager = findViewById(R.id.main_view_pager)

        navController = Navigation.findNavController(this, R.id.activity_main_nav_host_fragment)
        setupWithNavController(bottomNavigationView, navController)
        bottomNavigationView.itemIconTintList = null

        // viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        //  main_view_pager.adapter = viewPagerAdapter
    }
}