package ch.heigvd.daa_labo2.part1

import android.app.Activity
import android.os.Bundle

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ch.heigvd.daa_labo2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part11)
    }

    fun openSecondActivity(view: View) {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }
}