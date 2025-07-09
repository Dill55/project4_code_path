package com.example.project4_code_path

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.view.View
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val simpleEditText = findViewById<EditText>(R.id.editTextNumber);
        val textView = findViewById<TextView>(R.id.textView);
        val radioButton = findViewById<RadioButton>(R.id.radioButton);

        findViewById<Button>(R.id.radioButton)
            .setOnClickListener{

                val strVal = simpleEditText.getText().toString();

                textView.text = strVal.reversed();

                radioButton.isChecked = false;


            }
    }


}