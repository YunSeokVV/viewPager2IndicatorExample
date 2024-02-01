package com.example.viewpage2rindicator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpage2rindicator.databinding.ActivityOnboardingBinding
import com.google.android.material.tabs.TabLayoutMediator

class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            introViewPager.adapter = OnboardingAdapter()
            TabLayoutMediator(intoTabLayout, introViewPager) { tab, position -> }.attach() //The Magical Line
        }
    }
}