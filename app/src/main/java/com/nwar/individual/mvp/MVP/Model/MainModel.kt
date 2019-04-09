package com.nwar.individual.mvp.MVP.Model

import android.util.Log

class MainModel {
    var arr = ArrayList<AccountModel>()
    fun onLogin(ID : String, PW : String) = if(null!=arr.find { it.ID==ID&&it.PW==PW }) true else false
    fun signUp(ID : String, PW : String) { arr.add(AccountModel(ID,PW)) }

    class AccountModel(final val ID : String, final val PW : String)
}