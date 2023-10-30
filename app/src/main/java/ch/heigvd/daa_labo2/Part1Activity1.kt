package ch.heigvd.daa_labo2

import android.app.Activity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ch.heigvd.daa_labo2.ui.theme.DAA_Labo2Theme

import android.content.Intent
import android.view.View

class Part1Activity1 : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part11)
    }

    fun openSecondActivity(view: View) {
        val intent = Intent(this, Part1Activity2::class.java)
        startActivity(intent)
    }
}