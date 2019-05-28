package com.example.thinguyen.musicfinding

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

/**
 * Created by thinguyen on 26/05/2019.
 */

class MainActivity : AppCompatActivity() {

    private var loginButton: Button? = null
    private var editTextUserName: EditText? = null
    private var editTextPassword: EditText? = null
    private var userName: String? = null
    private var password: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton = findViewById<View>(R.id.loginButton) as Button
        editTextUserName = findViewById<View>(R.id.edEmail) as EditText
        editTextPassword = findViewById<View>(R.id.edPassword) as EditText

        loginButton?.setOnClickListener { openMainMenuPage() }
    }

    fun openMainMenuPage() {
        var checkValidation = false;
        userName = editTextUserName?.text.toString();
        password = editTextPassword?.text.toString();

        checkValidation = checkUserNamePassword(userName.toString(),password.toString());

        if(checkValidation == true){
            val mainMenuIntent = Intent(this, HomePageActivity::class.java)
            startActivity(mainMenuIntent)
        }
        else{
            Toast.makeText(getApplicationContext(),R.string.validation_login,Toast.LENGTH_SHORT).show();
        }

    }

/**
 * Check validation for user name and password
 * username > 6 characters
 * password > 8 characters*/

    fun checkUserNamePassword(userNameText:String , passwordText:String) :Boolean {
        if(userNameText.length <= 6 || passwordText.length <= 8){
            return false;
        }
        return true;
    }
}
