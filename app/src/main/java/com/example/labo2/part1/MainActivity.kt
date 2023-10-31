package com.example.labo2.part1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.labo2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit = findViewById<TextView>(R.id.editButton)
        edit.setOnClickListener {
            val i = Intent(this, Activity2::class.java)
            if (NAME != "")
                i.putExtra(Activity2.NAME, NAME)
            startActivityForResult(i, ASK_FOR_NAME_ID)
        }
    }


    @Deprecated("Deprecated in Java")
    @SuppressLint("SetTextI18n")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == ASK_FOR_NAME_ID && resultCode == RESULT_OK) {
            val name = data?.getStringExtra(ASK_FOR_NAME_KEY)

            val welcomeTextBegin = getString(R.string.welcome_name_begin)

            val welcomeTextEnd = getString(R.string.welcome_name_end)

            findViewById<TextView>(R.id.welcomeText).text = "$welcomeTextBegin $name $welcomeTextEnd"
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }

    companion object {
        val NAME = "NAME"
        val ASK_FOR_NAME_ID = 1
        val ASK_FOR_NAME_KEY = "ASK_FOR_NAME_KEY"
    }
}