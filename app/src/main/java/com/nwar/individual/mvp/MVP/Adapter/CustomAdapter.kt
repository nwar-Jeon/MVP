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
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        return ViewHolder(ItemBinding.inflate(LayoutInflater.from(p0.context),p0,false))
    }
    inner class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(view){

    }
}