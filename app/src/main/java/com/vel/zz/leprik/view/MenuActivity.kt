package com.vel.zz.leprik.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.vel.zz.leprik.R
import com.vel.zz.leprik.contracts.MenuContract
import com.vel.zz.leprik.presenter.MenuPresenter

class MenuActivity : AppCompatActivity(), MenuContract {

    private lateinit var playButton: ImageView
    private lateinit var webView: ImageView
    private lateinit var presenter: MenuPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        presenter = MenuPresenter(this)

        init()

        setOnClickListener()

    }

    private fun setOnClickListener() {
        playButton.setOnClickListener {
            presenter.onPlayButtonClick()
        }
        webView.setOnClickListener {
            presenter.onWebViewButtonClick()
        }
    }

    private fun init() {
        playButton = findViewById(R.id.play_button)
        webView = findViewById(R.id.web_view_button)
    }

    override fun startGameActivity(){
        startActivity(Intent(this, GameActivity::class.java))
    }

    override fun startWebViewActivity(){
        startActivity(Intent(this, WebViewActivity::class.java))
    }
}
