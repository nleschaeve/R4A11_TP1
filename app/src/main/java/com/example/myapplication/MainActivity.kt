package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Variable to keep last added view ID
    private var lastViewId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val mainLayout = findViewById<ConstraintLayout>(R.id.main)
        val premierBouton = findViewById<Button>(R.id.button_submit)
        val editText = findViewById<EditText>(R.id.editText)
        val textView = findViewById<TextView>(R.id.textView)

        // Init lastViewId with button ID
        lastViewId = premierBouton.id

        // Controler on the bouton
        premierBouton.setOnClickListener {
            val text = editText.text.toString()

            if (text == "Afficher nouveau textView") {
                val secondTextView = TextView(this)
                secondTextView.text = text
                secondTextView.id = View.generateViewId()

                val params = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
                )

                params.topToBottom = lastViewId
                params.startToStart = ConstraintLayout.LayoutParams.PARENT_ID
                params.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID
                params.topMargin = 16

                secondTextView.layoutParams = params

                mainLayout.addView(secondTextView)

                lastViewId = secondTextView.id
            } else {
                textView.text = text
            }
        }
    }
}