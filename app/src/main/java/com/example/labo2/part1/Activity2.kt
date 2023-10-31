package com.example.labo2.part1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.labo2.R

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val saveBtn = findViewById<Button>(R.id.saveBtn)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)

        saveBtn.setOnClickListener {
            val value = nameEditText.text.toString()
            val data = Intent(this, MainActivity::class.java)
            data.putExtra(MainActivity.ASK_FOR_NAME_KEY, value)
            setResult(RESULT_OK, data)
            finish()
        }
    }

    companion object {
        val NAME = "NAME"
    }
}