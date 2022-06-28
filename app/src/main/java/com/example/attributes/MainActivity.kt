package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_blacktext   = findViewById<Button>(R.id.button_blacktext);
        val button_redtext     = findViewById<Button>(R.id.button_redtext);
        val button_whitebg     = findViewById<Button>(R.id.button_whitebg);
        val button_yellowbg    = findViewById<Button>(R.id.button_yellowbg);
        val button_size8sp     = findViewById<Button>(R.id.button_size8sp);
        val button_size24sp    = findViewById<Button>(R.id.button_size24sp);

        val EditText = findViewById<EditText>(R.id.EditText);

        button_redtext.setOnClickListener {
            EditText.setTextColor(Color.RED);
        }

        button_blacktext.setOnClickListener {
            EditText.setTextColor(Color.BLACK);
        }
        button_whitebg.setOnClickListener {
            EditText.setBackgroundColor(Color.WHITE);
        }

        button_yellowbg.setOnClickListener {
            EditText.setBackgroundColor(Color.YELLOW);
        }

        button_size8sp.setOnClickListener {
            EditText.setTextSize(8F);
        }

        button_size24sp.setOnClickListener {
            EditText.setTextSize(24F);
        }

    }
}