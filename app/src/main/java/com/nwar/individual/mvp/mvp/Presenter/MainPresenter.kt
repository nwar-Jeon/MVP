package com.nwar.individual.mvp.mvp.Presenter

import com.nwar.individual.mvp.mvp.MainVP
import com.nwar.individual.mvp.mvp.Model.MainModel

class MainPresenter (val mainView : MainVP.View): MainVP.Presenter{
    final val model = MainModel()
    override fun tryLogin(ID: String, PW: String) {
        mainView.onResultLogin(model.onLogin(ID,PW))
    }

    override fun signUp(ID: String, PW: String) {
        model.signUp(ID,PW)
    }
}