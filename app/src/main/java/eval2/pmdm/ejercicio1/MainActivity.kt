package eval2.pmdm.ejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import eval2.pmdm.ejercicio1.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Añadiendo viewBinding.enabled = true en android del build.gradle podremos utilizar el view binding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val texto = findViewById<TextView>(R.id.textView)

        //Añadiendo id 'kotlin-android-extensions' en plugins del build.gradle podemos acceder a la vista directamente
        boton.setOnClickListener {
            texto.visibility = View.VISIBLE
            texto.text = binding.editText.text.toString()
        }
    }
}