package com.example.viewpager_3homwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager_3homwork.Models.MyData
import com.example.viewpager_3homwork.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var viewPagerAdapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        MyData.loddata()
        viewPagerAdapter = ViewPagerAdapter(MyData.list)
        binding.viewPager2.adapter = viewPagerAdapter
        binding.wormDot.setViewPager2(binding.viewPager2)
        binding.materialButton.setOnClickListener {
            binding.viewPager2.currentItem +=1
        }
    }
}