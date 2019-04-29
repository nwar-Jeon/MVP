package com.nwar.individual.mvp.mvp.View

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.nwar.individual.mvp.mvp.adapter.CustomAdapter
import com.nwar.individual.mvp.mvp.DataModule.Data
import com.nwar.individual.mvp.R
import com.nwar.individual.mvp.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    lateinit var binding : ActivityRecyclerViewBinding
    var items = ArrayList<Data>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        items.apply {
            add(Data("제목입니다","내용입니다"))
            add(Data("제목입니다","내용입니다"))
            add(Data("제목입니다","내용입니다"))
            add(Data("제목입니다","내용입니다"))
            add(Data("제목입니다","내용입니다"))
            add(Data("제목입니다","내용입니다"))
            add(Data("제목입니다","내용입니다"))
            add(Data("제목입니다","내용입니다"))
            add(Data("제목입니다","내용입니다"))
            add(Data("제목입니다","내용입니다"))
        }

        val adaper = CustomAdapter(this,items)
        val lm = LinearLayoutManager(this)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_recycler_view)

        binding.recyclerView.apply{
            adapter = adaper
            layoutManager = lm
            setHasFixedSize(true)
        }
    }
}
//val padding = TypedValue.applyDimension( TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics).toInt()
//setPadding(padding, 0, padding, 0)

//              TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics).toInt().let { padding -> setPadding(padding, 0, padding, 0)}
