package com.library.jitpackexample.reverse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.library.jitpackexample.reverser.Reverser

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_reverse).setOnClickListener {
            findViewById<TextView>(R.id.txt_reverse).text =
                Reverser.reverseString(findViewById<TextView>(R.id.txt_reverse).text.toString())
        }
    }
}