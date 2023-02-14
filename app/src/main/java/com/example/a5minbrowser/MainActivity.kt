package com.example.a5minbrowser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchButton = findViewById<Button>(R.id.searchButton)
        val inputSearch = findViewById<EditText>(R.id.inputSearch)
        val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient()

        searchButton.setOnClickListener{
            webView.loadUrl(inputSearch.text.toString())
        }
    }
}