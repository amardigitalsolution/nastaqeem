package com.amarDigital.nastaqeem.ui.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.amarDigital.nastaqeem.ui.MainActivity
import com.amarDigital.nastaqeem.R

class SplashScreenActivity : AppCompatActivity() {
    private var TIME_OUT:Long = 500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        loadSplashScreen()
    }
    private fun loadSplashScreen(){
        Handler().postDelayed({
            // You can declare your desire activity here to open after finishing splash screen. Like MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },TIME_OUT)
    }
}