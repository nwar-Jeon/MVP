package com.nwar.individual.mvp.mvp.Model

class RecyclerViewModel {
    final var count = 0
    fun getText() = count++.toString() + "번째 변환"
}