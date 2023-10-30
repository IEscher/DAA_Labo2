package ch.heigvd.daa_labo2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ch.heigvd.daa_labo2.ui.theme.DAA_Labo2Theme

class Part1Activity2 : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part12)
    }

    fun openSecondActivity(view: View) {
        val intent = Intent(this, Part1Activity1::class.java)
        startActivity(intent)
    }
}