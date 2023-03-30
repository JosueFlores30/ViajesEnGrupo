package mx.edu.potros.viajesengrupo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.google.android.material.bottomnavigation.BottomNavigationView


class Eventos : AppCompatActivity() {
    var eventos = ArrayList<Evento>();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eventos)

        addEventos()

        //var adapter=EventoAdapter(this,eventos)
        var list:LinearLayout = findViewById(R.id.listEventos)
        llenarListaEventos(list)

        var btnAgregarEvento:Button=findViewById(R.id.btnAgregarEvento)

        btnAgregarEvento.setOnClickListener {
            var intent= Intent(this,AgregarEvento::class.java)
            startActivity(intent)
        }

        // Empieza :D
        val btnNavAdd = findViewById<ImageButton>(R.id.btnNavAdd)
        btnNavAdd.setOnClickListener {
            val intent = Intent(this, SeleccionarUbicacion::class.java)
            startActivity(intent)
        }
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.btnViajes -> {
                    val intent = Intent(this, MisViajes::class.java)
                    startActivity(intent)
                    true
                }
                R.id.btnHome -> {
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                    true
                }
                R.id.btnUser -> {
                    val intent = Intent(this, Perfil::class.java)
                    startActivity(intent)
                    true
                }
                R.id.btnAmigos -> {
                    val intent = Intent(this, Amigo::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
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

    private fun ocultarNavBar() {
        var navBar:LinearLayout=findViewById(R.id.nav_bar)

        var scrollView:ScrollView=findViewById(R.id.scrollViewEventos)
        if(scrollView.canScrollVertically(1)||scrollView.canScrollVertically(-1)){
            navBar.visibility= View.GONE
        }
        scrollView.setOnScrollChangeListener { view, i, i2, i3, i4 ->
            navBar.visibility= View.VISIBLE
        }
    }

    fun addEventos(){
        eventos.add(Evento(R.drawable.airplane,"Vuelo","7:00 am","Aeropuerto de Cd. obregon",0))
        eventos.add(Evento(R.drawable.house,"Vuelo","10:00 am","Hotel imaginario",0))
        eventos.add(Evento(R.drawable.house,"Visitar museo","4:00 pm","Museo imaginario",0))
    }

    fun llenarListaEventos(listEventos: LinearLayout){
        eventos.forEach {
            var inflador=LayoutInflater.from(this);
            var vista=inflador.inflate(R.layout.activity_evento,null)

            var icono=vista.findViewById(R.id.iconTitle) as ImageView
            var titulo=vista.findViewById(R.id.txtTitulo) as TextView
            var hora=vista.findViewById(R.id.txtHora) as TextView
            var ubicacion=vista.findViewById(R.id.txtHora) as TextView
            var imgEncargado=vista.findViewById(R.id.imgEncargado) as ImageView

            icono.setImageResource(it.icono)
            titulo.setText(it.titulo)
            hora.setText((it.hora))
            ubicacion.setText(it.ubicacion)

            listEventos.addView(vista)
        }
    }
/*    private class EventoAdapter:BaseAdapter{
        var listEventos =ArrayList<Evento>()
        var contexto:Context?=null

        constructor(contexto: Context?,listEventos: ArrayList<Evento> ){
            this.listEventos = listEventos
            this.contexto = contexto
        }

        override fun getCount(): Int {
            return listEventos.size
        }

        override fun getItem(p0: Int): Any {
            return listEventos.get(p0)
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var evento = listEventos[p0]
            var inflador=LayoutInflater.from(contexto)
            var vista=inflador.inflate(R.layout.activity_evento,null)

            var icono=vista.findViewById(R.id.iconTitle) as ImageView
            var titulo=vista.findViewById(R.id.txtTitulo) as TextView
            var hora=vista.findViewById(R.id.txtHora) as TextView
            var ubicacion=vista.findViewById(R.id.txtHora) as TextView
            var imgEncargado=vista.findViewById(R.id.imgEncargado) as ImageView

            icono.setImageResource(evento.icono)
            titulo.setText(evento.titulo)
            hora.setText((evento.hora))
            ubicacion.setText(evento.ubicacion)
            //imgEncargado.setImageResource(evento.imgEncargado)

            return vista
        }

    }*/
}