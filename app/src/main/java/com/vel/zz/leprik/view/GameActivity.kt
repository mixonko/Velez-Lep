package com.vel.zz.leprik.view

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.vel.zz.leprik.R
import com.vel.zz.leprik.contracts.GameContract
import com.vel.zz.leprik.presenter.GamePresenter

class GameActivity: AppCompatActivity(), GameContract {

    private lateinit var presenter: GamePresenter

    private lateinit var time: SeekBar

    private lateinit var youWin: FrameLayout

    private val image1 = R.drawable.ic_image1
    private val image2 = R.drawable.ic_image2
    private val image3 = R.drawable.ic_image3
    private val image4 = R.drawable.ic_image4
    private val image5 = R.drawable.ic_image5
    private val image6 = R.drawable.ic_image6
    private val image7 = R.drawable.ic_image7
    private val image8 = R.drawable.ic_image8
    private val image9 = R.drawable.ic_image9
    private val image10 = R.drawable.ic_image10
    private val image11 = R.drawable.ic_image11
    private val image12 = R.drawable.ic_image12

    private lateinit var imageView11: ImageView
    private lateinit var imageView12: ImageView
    private lateinit var imageView13: ImageView
    private lateinit var imageView14: ImageView
    private lateinit var imageView15: ImageView
    private lateinit var imageView16: ImageView
    private lateinit var imageView21: ImageView
    private lateinit var imageView22: ImageView
    private lateinit var imageView23: ImageView
    private lateinit var imageView24: ImageView
    private lateinit var imageView25: ImageView
    private lateinit var imageView26: ImageView
    private lateinit var imageView31: ImageView
    private lateinit var imageView32: ImageView
    private lateinit var imageView33: ImageView
    private lateinit var imageView34: ImageView
    private lateinit var imageView35: ImageView
    private lateinit var imageView36: ImageView
    private lateinit var imageView41: ImageView
    private lateinit var imageView42: ImageView
    private lateinit var imageView43: ImageView
    private lateinit var imageView44: ImageView
    private lateinit var imageView45: ImageView
    private lateinit var imageView46: ImageView

    private var imageList = mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12)


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_game)

        presenter = GamePresenter(this)
  
        init()

        setTag()

        setOnClickListener()
    }

    private fun setTag() {
        imageView11.setTag(0)
        imageView12.setTag(1)
        imageView13.setTag(2)
        imageView14.setTag(3)
        imageView15.setTag(4)
        imageView16.setTag(5)
        imageView21.setTag(6)
        imageView22.setTag(7)
        imageView23.setTag(8)
        imageView24.setTag(9)
        imageView25.setTag(10)
        imageView26.setTag(11)
        imageView31.setTag(12)
        imageView32.setTag(13)
        imageView33.setTag(14)
        imageView34.setTag(15)
        imageView35.setTag(16)
        imageView36.setTag(17)
        imageView41.setTag(18)
        imageView42.setTag(19)
        imageView43.setTag(20)
        imageView44.setTag(21)
        imageView45.setTag(22)
        imageView46.setTag(23)
    }

    private fun setOnClickListener() {
        imageView11.setOnClickListener { presenter.onImageViewClick(imageView11.getTag() as Int, imageView11) }
        imageView12.setOnClickListener { presenter.onImageViewClick(imageView12.getTag() as Int, imageView12) }
        imageView13.setOnClickListener { presenter.onImageViewClick(imageView13.getTag() as Int, imageView13) }
        imageView14.setOnClickListener { presenter.onImageViewClick(imageView14.getTag() as Int, imageView14) }
        imageView15.setOnClickListener { presenter.onImageViewClick(imageView15.getTag() as Int, imageView15) }
        imageView16.setOnClickListener { presenter.onImageViewClick(imageView16.getTag() as Int, imageView16) }
        imageView21.setOnClickListener { presenter.onImageViewClick(imageView21.getTag() as Int, imageView21) }
        imageView22.setOnClickListener { presenter.onImageViewClick(imageView22.getTag() as Int, imageView22) }
        imageView23.setOnClickListener { presenter.onImageViewClick(imageView23.getTag() as Int, imageView23) }
        imageView24.setOnClickListener { presenter.onImageViewClick(imageView24.getTag() as Int, imageView24) }
        imageView25.setOnClickListener { presenter.onImageViewClick(imageView25.getTag() as Int, imageView25) }
        imageView26.setOnClickListener { presenter.onImageViewClick(imageView26.getTag() as Int, imageView26) }
        imageView31.setOnClickListener { presenter.onImageViewClick(imageView31.getTag() as Int, imageView31) }
        imageView32.setOnClickListener { presenter.onImageViewClick(imageView32.getTag() as Int, imageView32) }
        imageView33.setOnClickListener { presenter.onImageViewClick(imageView33.getTag() as Int, imageView33) }
        imageView34.setOnClickListener { presenter.onImageViewClick(imageView34.getTag() as Int, imageView34) }
        imageView35.setOnClickListener { presenter.onImageViewClick(imageView35.getTag() as Int, imageView35) }
        imageView36.setOnClickListener { presenter.onImageViewClick(imageView36.getTag() as Int, imageView36) }
        imageView41.setOnClickListener { presenter.onImageViewClick(imageView41.getTag() as Int, imageView41) }
        imageView42.setOnClickListener { presenter.onImageViewClick(imageView42.getTag() as Int, imageView42) }
        imageView43.setOnClickListener { presenter.onImageViewClick(imageView43.getTag() as Int, imageView43) }
        imageView44.setOnClickListener { presenter.onImageViewClick(imageView44.getTag() as Int, imageView44) }
        imageView45.setOnClickListener { presenter.onImageViewClick(imageView45.getTag() as Int, imageView45) }
        imageView46.setOnClickListener { presenter.onImageViewClick(imageView46.getTag() as Int, imageView46) }
    }

    private fun init(){

        imageView11 = findViewById(R.id.imageView11)
        imageView12 = findViewById(R.id.imageView12)
        imageView13 = findViewById(R.id.imageView13)
        imageView14 = findViewById(R.id.imageView14)
        imageView15 = findViewById(R.id.imageView15)
        imageView16 = findViewById(R.id.imageView16)
        imageView21 = findViewById(R.id.imageView21)
        imageView22 = findViewById(R.id.imageView22)
        imageView23 = findViewById(R.id.imageView23)
        imageView24 = findViewById(R.id.imageView24)
        imageView25 = findViewById(R.id.imageView25)
        imageView26 = findViewById(R.id.imageView26)
        imageView31 = findViewById(R.id.imageView31)
        imageView32 = findViewById(R.id.imageView32)
        imageView33 = findViewById(R.id.imageView33)
        imageView34 = findViewById(R.id.imageView34)
        imageView35 = findViewById(R.id.imageView35)
        imageView36 = findViewById(R.id.imageView36)
        imageView41 = findViewById(R.id.imageView41)
        imageView42 = findViewById(R.id.imageView42)
        imageView43 = findViewById(R.id.imageView43)
        imageView44 = findViewById(R.id.imageView44)
        imageView45 = findViewById(R.id.imageView45)
        imageView46 = findViewById(R.id.imageView46)

        youWin = findViewById(R.id.you_win)

        time = findViewById(R.id.time)
    }
}
