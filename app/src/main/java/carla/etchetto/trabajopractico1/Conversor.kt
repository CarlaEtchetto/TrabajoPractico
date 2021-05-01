package carla.etchetto.trabajopractico1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Conversor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor)
        val celcius: EditText = findViewById(R.id.e_numero)
        val convertir: Button = findViewById(R.id.b_convertir)
        val resultadoconver: TextView = findViewById(R.id.c_resultado)


       convertir.setOnClickListener( View.OnClickListener{
           val tempc = celcius.text.toString().toDouble()
           val res = ((tempc*9/5) + 32)

           resultadoconver.text = res.toString() + " " + "GRADOS FAHRENHEIT"

       })

    }

}

