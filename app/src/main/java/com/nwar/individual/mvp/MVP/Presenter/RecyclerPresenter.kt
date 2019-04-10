package com.nwar.individual.mvp.MVP.Presenter

import com.nwar.individual.mvp.MVP.MainVP
import com.nwar.individual.mvp.MVP.Model.RecyclerViewModel

class RecyclerPresenter(val view : MainVP.ViewOfRecycler) : MainVP.PresenterOfRecycler {
    val model = RecyclerViewModel()
    override fun getTextForSetText(){
        view.setText(model.getText())
    }
}