package com.example.viewpage2rindicator

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.viewpage2rindicator.databinding.RowItemViewpagerBinding

class OnboardingAdapter() : RecyclerView.Adapter<OnboardingAdapter.ViewHolder>() {
    class ViewHolder(val binding: RowItemViewpagerBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        RowItemViewpagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            binding.apply {
                //Bind views with some data here

                if (position == 0) {
                    Glide.with(itemView)
                        .load(R.drawable.apple)
                        .into(imgIntro)
                } else if (position == 1) {
                    Glide.with(itemView)
                        .load(R.drawable.banana)
                        .into(imgIntro)
                } else if (position == 2) {
                    Glide.with(itemView)
                        .load(R.drawable.mango)
                        .into(imgIntro)
                } else if (position == 3) {
                    Glide.with(itemView)
                        .load(R.drawable.grape)
                        .into(imgIntro)
                } else if (position == 4) {
                    Glide.with(itemView)
                        .load(R.drawable.watermelon)
                        .into(imgIntro)
                }

            }
        }
    }

    override fun getItemCount() = 5
}