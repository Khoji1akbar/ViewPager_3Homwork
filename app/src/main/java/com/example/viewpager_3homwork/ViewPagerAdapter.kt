package com.example.viewpager_3homwork

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager_3homwork.Models.Data
import com.example.viewpager_3homwork.databinding.ItemViewpagerBinding

class ViewPagerAdapter(val list: List<Data>):RecyclerView.Adapter<ViewPagerAdapter.Vh>() {
    inner class Vh(var itemViewPagerBinding : ItemViewpagerBinding):RecyclerView.ViewHolder(itemViewPagerBinding.root){
    fun onBind(data: Data) {
        itemViewPagerBinding.title.text = data.title
        itemViewPagerBinding.description.text = data.description
        itemViewPagerBinding.image.setImageResource(data.image)
    }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemViewpagerBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
       return list.size
    }
}