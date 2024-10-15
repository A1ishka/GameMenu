package com.game_menu

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        title = "Game Menu";
        var text: TextView = findViewById(R.id.text)
        val button1: AppCompatButton = findViewById(R.id.button1)
        val button2: AppCompatButton = findViewById(R.id.button2)
        val button3: AppCompatButton = findViewById(R.id.button3)
        val button4: AppCompatButton = findViewById(R.id.button4)
        val button5: AppCompatButton = findViewById(R.id.button5)
        val button6: AppCompatButton = findViewById(R.id.button6)
        val button7: AppCompatButton = findViewById(R.id.button7)
        val button8: AppCompatButton = findViewById(R.id.button8)
        val button9: AppCompatButton = findViewById(R.id.button9)
        val button10: AppCompatButton = findViewById(R.id.button10)
        val button11: AppCompatButton = findViewById(R.id.button11)
        val button12: AppCompatButton = findViewById(R.id.button12)
        val button13: AppCompatButton = findViewById(R.id.button13)
        val button14: AppCompatButton = findViewById(R.id.button14)
        val button15: AppCompatButton = findViewById(R.id.button15)
        val button16: AppCompatButton = findViewById(R.id.button16)
        val button17: AppCompatButton = findViewById(R.id.button17)
        val button18: AppCompatButton = findViewById(R.id.button18)
        val button19: AppCompatButton = findViewById(R.id.button19)
        val button20: AppCompatButton = findViewById(R.id.button20)
        val button21: AppCompatButton = findViewById(R.id.button21)
        val button22: AppCompatButton = findViewById(R.id.button22)
        val button23: AppCompatButton = findViewById(R.id.button23)
        val button24: AppCompatButton = findViewById(R.id.button24)
        val button25: AppCompatButton = findViewById(R.id.button25)
        val back_button: AppCompatButton = findViewById(R.id.button_back)

        button1.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button1.text)
            Log.d("GameMenu 1", text.text.toString())
        }

        button2.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button2.text)
            Log.d("GameMenu 2", text.text.toString())
        }

        button3.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button3.text)
            Log.d("GameMenu 3", text.text.toString())
        }

        button4.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button4.text)
            Log.d("GameMenu 4", text.text.toString())
        }

        button5.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button5.text)
            Log.d("GameMenu 5", text.text.toString())
        }

        button6.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button6.text)
            Log.d("GameMenu 6", text.text.toString())
        }

        button7.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button7.text)
            Log.d("GameMenu 7", text.text.toString())
        }

        button8.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button8.text)
            Log.d("GameMenu 8", text.text.toString())
        }

        button9.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button9.text)
            Log.d("GameMenu 9", text.text.toString())
        }

        button10.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button10.text)
            Log.d("GameMenu 10", text.text.toString())
        }

        button11.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button11.text)
            Log.d("GameMenu 11", text.text.toString())
        }

        button12.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button12.text)
            Log.d("GameMenu 12", text.text.toString())
        }

        button13.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button13.text)
            Log.d("GameMenu 13", text.text.toString())
        }

        button14.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button14.text)
            Log.d("GameMenu 14", text.text.toString())
        }

        button15.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button15.text)
            Log.d("GameMenu 15", text.text.toString())
        }

        button16.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button16.text)
            Log.d("GameMenu 16", text.text.toString())
        }

        button17.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button17.text)
            Log.d("GameMenu 17", text.text.toString())
        }

        button18.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button18.text)
            Log.d("GameMenu 18", text.text.toString())
        }

        button19.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button19.text)
            Log.d("GameMenu 19", text.text.toString())
        }

        button20.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button20.text)
            Log.d("GameMenu 20", text.text.toString())
        }

        button21.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button21.text)
            Log.d("GameMenu 21", text.text.toString())
        }

        button22.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button22.text)
            Log.d("GameMenu 22", text.text.toString())
        }

        button23.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button23.text)
            Log.d("GameMenu 23", text.text.toString())
        }

        button24.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button24.text)
            Log.d("GameMenu 24", text.text.toString())
        }

        button25.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, button25.text)
            Log.d("GameMenu 25", text.text.toString())
        }

        back_button.setOnClickListener {
            text.text = getString(R.string.button_is_pressed, back_button.text)
            Log.d("GameMenu back", text.text.toString())
            Thread.sleep(200)
            finish()
        }
    }
}