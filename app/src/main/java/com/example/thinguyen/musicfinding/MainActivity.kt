package com.example.thinguyen.musicfinding

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

/**
 * Created by thinguyen on 26/05/2019.
 */

class MainActivity : AppCompatActivity() {

    private var loginButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton = findViewById<View>(R.id.loginButton) as Button

        loginButton!!.setOnClickListener { openMainMenuPage() }
    }

    fun openMainMenuPage() {
        val mainMenuIntent = Intent(this, MenuPageActivity::class.java)
        startActivity(mainMenuIntent)

    }
}
