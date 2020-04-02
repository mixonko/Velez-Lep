package com.vel.zz.leprik.view

import android.os.Bundle
import android.os.PersistableBundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.vel.zz.leprik.R
import com.vel.zz.leprik.other.MyWebViewClient

class WebViewActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_web_view)

        val webView: WebView = findViewById(R.id.web_view)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = MyWebViewClient()
        webView.loadUrl("https://google.com")
    }
}
