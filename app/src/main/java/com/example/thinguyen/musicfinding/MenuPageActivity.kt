package com.example.thinguyen.musicfinding

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Created by thinguyen on 26/05/2019.
 */


class MenuPageActivity : AppCompatActivity() {

    private var mTextMessage: TextView? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                mTextMessage!!.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                mTextMessage!!.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_place -> {
                mTextMessage!!.setText(R.string.title_place)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                mTextMessage!!.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_page)

        mTextMessage = findViewById<TextView>(R.id.message)
        val navigation = findViewById<TextView>(R.id.navigation) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

}