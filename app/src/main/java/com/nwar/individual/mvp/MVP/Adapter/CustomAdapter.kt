package com.nwar.individual.mvp.MVP.Adapter

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nwar.individual.mvp.MVP.DataModule.Data
import com.nwar.individual.mvp.R
import com.nwar.individual.mvp.databinding.ItemBinding

class CustomAdapter (val context : Context, val items : ArrayList<Data>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    lateinit var binding : ItemBinding
    override fun getItemCount() = items.size

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        if(p0 is CustomAdapter.ViewHolder){
            p0.setItem(items.get(p1))
        }
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int) = ViewHolder(ItemBinding.inflate(LayoutInflater.from(p0.context),p0,false))
    inner class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun setItem(data : Data){
            binding.tvTitle.text = data.title
            binding.tvContent.text = data.content
        }
    }
}