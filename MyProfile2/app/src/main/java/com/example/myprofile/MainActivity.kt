
package com.example.padwal1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myprofile.*
import com.example.myprofile.R.layout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener {

          val intent3 = Intent(this, certification::class.java)

            startActivity(intent3)}

            val btn2 = findViewById<Button>(R.id.button2)
            btn3.setOnClickListener {

                val intent2 = Intent(this, positionofresponsibility::class.java)

                startActivity(intent2)}

                val btn1 = findViewById<Button>(R.id.button1)
                btn3.setOnClickListener {

                    val intent1 = Intent(this, achivments::class.java)

                    startActivity(intent1)}
                    val btn4 = findViewById<Button>(R.id.button4)
                    btn3.setOnClickListener {

                        val intent4 = Intent(this, projectandinternshhip::class.java)

                        startActivity(intent4)}


                    }


    }

