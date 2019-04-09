package com.nwar.individual.mvp.MVP

interface MainVP {
    interface View{
        fun onResultLogin(result : Boolean)
    }

    interface Presenter{
        fun tryLogin(ID : String, PW : String)
        fun signUp(ID: String, PW : String)
    }
}