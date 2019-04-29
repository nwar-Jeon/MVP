package com.nwar.individual.mvp.mvp.View

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nwar.individual.mvp.mvp.MainVP
import com.nwar.individual.mvp.mvp.Presenter.MainPresenter
import com.nwar.individual.mvp.R
import com.nwar.individual.mvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainVP.View{
    lateinit var binding : ActivityMainBinding
    val presenter = MainPresenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        setOnClick()
    }
    fun setOnClick(){
        binding.btnBotton1.setOnClickListener {
            presenter.tryLogin(binding.etInputId1.text.toString(), binding.etInputpw1.text.toString())
        }
        binding.signUp.setOnClickListener {
            presenter.signUp(binding.etInputId1.text.toString(),binding.etInputpw1.text.toString())
        }
    }

    override fun onResultLogin(result: Boolean) {
        if(result){
            Toast.makeText(this,"로그인 성공",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,RecyclerViewActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this,"로그인 실패. 아이디 패스워드 확인하세요.",Toast.LENGTH_SHORT).show()
        }
    }
}