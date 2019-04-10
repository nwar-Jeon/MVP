package com.nwar.individual.mvp.MVP.View

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.nwar.individual.mvp.MVP.Adapter.CustomAdapter
import com.nwar.individual.mvp.MVP.DataModule.Data
import com.nwar.individual.mvp.R
import com.nwar.individual.mvp.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    lateinit var binding : ActivityRecyclerViewBinding
    var items = ArrayList<Data>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        items.add(Data("제목입니다","내용입니다."))
        items.add(Data("제목입니다","내용입니다."))
        items.add(Data("제목입니다","내용입니다."))

        val adapter = CustomAdapter(this,items)
        val lm = LinearLayoutManager(this)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_recycler_view)

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = lm
        binding.recyclerView.setHasFixedSize(true)
    }
}
