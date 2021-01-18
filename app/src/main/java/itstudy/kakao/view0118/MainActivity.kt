package itstudy.kakao.view0118

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.webViewClient = WebViewClient()

        webView.loadUrl("http://www.naver.com")

        this.btngo.setOnClickListener {
            val url = addr.text.toString()
            webView.loadUrl(url)
        }

        btnback.setOnClickListener {
            webView.goBack()
        }

        btnforward.setOnClickListener {
            webView.goForward()
        }

        btnlocal.setOnClickListener {
            webView.loadUrl("file:///android_asset/test.html")
        }
    }
}