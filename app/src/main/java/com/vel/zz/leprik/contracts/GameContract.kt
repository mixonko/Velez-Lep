package com.vel.zz.leprik.contracts

import android.widget.ImageView

interface GameContract {
    fun showImage(imageView: ImageView, image: Int, duration: Long)
    fun hideImages(vararg imageView: ImageView, duration: Long, delayMillis: Long)
    fun showTrue(vararg imageView: ImageView, duration: Long, delayMillis: Long)
    fun showFalce(vararg imageView: ImageView, duration: Long, delayMillis: Long)
    fun showYouWin(delayMillis: Long)
    fun setAllEnable(delayMillis: Long)
    fun setAllDisable()
    fun setDisable(imageView: ImageView)
    fun startNewGame()
    fun showTryAgain()
    fun startCountDownTimer(millisInFuture: Long)
    fun stopCountDownTimer()

}
