package com.vel.zz.leprik.presenter

import com.vel.zz.leprik.contracts.MenuContract

class MenuPresenter(val view: MenuContract) {
    fun onWebViewButtonClick() {
        view.startWebViewActivity()
    }

    fun onPlayButtonClick() {
        view.startGameActivity()
    }
}
