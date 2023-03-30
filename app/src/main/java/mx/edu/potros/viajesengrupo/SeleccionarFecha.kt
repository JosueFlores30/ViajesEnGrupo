package mx.edu.potros.viajesengrupo

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.DragEvent
import android.view.View
import android.widget.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class SeleccionarFecha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccionar_fecha)

        var calendarView: CalendarView =findViewById(R.id.calendarioInicio)

        var btnSiguiente: Button = findViewById(R.id.btnSiguiente)
        btnSiguiente.setOnClickListener {
            var intent= Intent(this,AgregarAmigoViaje::class.java)
            startActivity(intent)
        }

        // Empieza :D
        val btnMessages = findViewById<ImageView>(R.id.btnMessages)
        val btnNotifications = findViewById<ImageView>(R.id.btnNotifications)
        btnMessages.setOnClickListener {
            val intent = Intent(this, Inbox::class.java)
            startActivity(intent)
        }
        btnNotifications.setOnClickListener {
            val intent = Intent(this, Notificaciones::class.java)
            startActivity(intent)
        }
        // termina :D


    }
}