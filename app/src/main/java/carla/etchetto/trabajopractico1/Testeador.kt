package carla.etchetto.trabajopractico1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Testeador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testeador)
        var frase: EditText = findViewById(R.id.e_texto);
        var chequear: Button = findViewById(R.id.b_chequear);
        var resultado: TextView = findViewById(R.id.t_resultado);

        chequear.setOnClickListener( View.OnClickListener{
            var palabrain = frase.text.toString()
            var palabrainreservo = palabrain.reversed()
            var espalin = palabrainreservo.equals(palabrain)
            if(espalin)
            {
                resultado.text = "ES UN PALINDROMO"
            }
            else
            {
                resultado.text = "NO ES PALINDROMO"
            }
        })

    }


}