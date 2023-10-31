package com.example.labo2.part3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.labo2.R


class MainActivityFragment2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment2)

        val buttonBack = findViewById<Button>(R.id.button_back)
        val buttonNext = findViewById<Button>(R.id.button_next)
        val buttonClose = findViewById<Button>(R.id.button_close)


        buttonBack.setOnClickListener {
            supportFragmentManager.popBackStack()
        }

        buttonNext.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.nav_host_fragment,
                    FragmentActivity2.newInstance(supportFragmentManager.backStackEntryCount)
                )
                .addToBackStack(null)
                .commit()
        }

        buttonClose.setOnClickListener{
            finish()
        }

    }
}