package com.nwar.individual.mvp.mvp

interface MainVP {
    interface View{
        fun onResultLogin(result : Boolean)
    }

    interface Presenter{
        fun tryLogin(ID : String, PW : String)
        fun signUp(ID: String, PW : String)
    }

    interface ViewOfRecycler{
        fun setText(content : String)
    }

    interface PresenterOfRecycler{
        fun getTextForSetText()
    }
}