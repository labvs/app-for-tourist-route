package com.example.den97.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.den97.helloworld.R.id.sample_text
import kotlinx.android.synthetic.main.activity_main_screen.*

class MainScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        // Example of a call to a native method
        sample_text.text = stringFromJNI()
    }

    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}