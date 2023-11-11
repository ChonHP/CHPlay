package com.example.chplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var pager: ViewPager // creating object of ViewPager
    private lateinit var tab: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(ItemFragment(), "For you")
        adapter.addFragment(SecondFragment(), "Top charts")
        adapter.addFragment(ThirdFragment(), "Other devices")
        pager.adapter = adapter
        tab.setupWithViewPager(pager)
    }
}