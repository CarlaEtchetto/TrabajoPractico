package carla.etchetto.trabajopractico1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val conver = findViewById<TextView>(R.id.conversor)
        val test = findViewById<TextView>(R.id.testeador)
        conver.setOnClickListener {
            val int1 = Intent(this, Conversor::class.java)
            startActivity(int1)
        }

        test.setOnClickListener {
            val int2 = Intent(this, Testeador::class.java)
            startActivity(int2)
        }
    }


}