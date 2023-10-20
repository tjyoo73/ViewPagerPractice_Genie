package com.tjlab.viewpagerpractice_genie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjlab.viewpagerpractice_genie.adapters.MainViewPagerAdapter
import com.tjlab.viewpagerpractice_genie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var mViewPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        binding.mainViewPager.adapter = mViewPagerAdapter
        binding.mainViewPager.offscreenPageLimit = 5

        binding.myTabLayout.setupWithViewPager(binding.mainViewPager)
    }
}