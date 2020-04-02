package com.vel.zz.leprik.contracts

import android.widget.ImageView

interface GameContract {
    fun showImage(imageView: ImageView, image: Int)
    fun showTrue(vararg imageView: ImageView)
    fun showFalce(vararg imageView: ImageView)
    fun showYouWin()
}
