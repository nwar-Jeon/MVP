package com.nwar.individual.mvp.mvp.Presenter

import com.nwar.individual.mvp.mvp.MainVP
import com.nwar.individual.mvp.mvp.Model.RecyclerViewModel

class RecyclerPresenter(val view : MainVP.ViewOfRecycler) : MainVP.PresenterOfRecycler {
    val model = RecyclerViewModel()
    override fun getTextForSetText(){
        view.setText(model.getText())
    }
}