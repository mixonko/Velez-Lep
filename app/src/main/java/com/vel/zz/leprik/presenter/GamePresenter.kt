package com.vel.zz.leprik.presenter

import android.widget.ImageView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.vel.zz.leprik.contracts.GameContract

class GamePresenter(val view: GameContract) : LifecycleObserver {

    private var itsFirstClick = true
    private var endGame: Int = 0
    private lateinit var firstImage: ImageView
    private lateinit var secondImage: ImageView
    private var firstCard: Int = 0
    private var secondCard: Int = 0

    private var cardList =
        mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24)


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun cardsShuffle() {

        //        Collections.shuffle(cardList)

    }

    fun onImageViewClick(i: Int, imageView: ImageView) {
        if (itsFirstClick) {
            itsFirstClick = false

            firstImage = imageView

            firstCard = getCard(i)
            if (firstCard > 12) {
                firstCard -= 12
            }

            showImage(firstImage, firstCard)
        }
        else {
            itsFirstClick = true

            secondImage = imageView

            secondCard = getCard(i)
            if (secondCard > 12) {
                secondCard -= 12
            }

            showImage(secondImage, secondCard)

            calculate()

        }

    }

    private fun getCard(i: Int) = cardList[i]

    private fun calculate() {
        if (firstCard == secondCard) {
//            showTrue()
            endGame++
            chechEndGame()
            view.showYouWin()

        } else {
//            showFalce()
        }
    }

    private fun chechEndGame() {
        if (endGame == 12) {
            view.showYouWin()
        }
    }

    private fun showImage(imageView: ImageView, card: Int) {
        view.showImage(imageView, card)
    }


    private fun showTrue() {
        view.showTrue(firstImage, secondImage)
    }

    private fun showFalce() {
        view.showFalce(firstImage, secondImage)
    }


}
