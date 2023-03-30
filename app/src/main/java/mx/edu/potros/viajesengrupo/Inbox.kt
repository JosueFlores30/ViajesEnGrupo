package mx.edu.potros.viajesengrupo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class Inbox : AppCompatActivity() {

    var inbox: ArrayList<Amigos> = ArrayList<Amigos>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inbox)

        agregarInbox()

        var listview: ListView = findViewById(R.id.listViewInbox)

        var  adaptador: AdaptadorInbox = AdaptadorInbox(this, inbox)

        listview.adapter=adaptador


    }

    fun agregarInbox(){
        inbox.add(Amigos(R.drawable.round_circle, "Fátima Macias","Ya encontré un restaurante para ir el..."))
        inbox.add(Amigos(R.drawable.round_circle, "Isaac Perez","Si, ya agregué un evento nuevo en el..."))
        inbox.add(Amigos(R.drawable.round_circle, "Jesús Lares","Todaví no encuentro un buen lugar :("))
        inbox.add(Amigos(R.drawable.round_circle, "Miguel Sanez","Cuídado en la carretera, va a llover"))
    }

    private class AdaptadorInbox: BaseAdapter {
        var inbox=ArrayList<Amigos>()
        var contexto: Context?=null

        constructor(contexto: Context, inbox: ArrayList<Amigos>){
            this.inbox=inbox
            this.contexto=contexto
        }

        override fun getCount(): Int {
            return inbox.size
        }

        override fun getItem(position: Int): Any {
            return inbox[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var inbo=inbox[position]
            var inflador= LayoutInflater.from(contexto)
            var vista=inflador.inflate(R.layout.inbox_view, null)

            var imagen=vista.findViewById(R.id.inbox_img) as ImageView
            var nombre=vista.findViewById(R.id.inbox_nombre_tv) as TextView
            var mensaje=vista.findViewById(R.id.inbox_mensajes_tv) as TextView


            imagen.setImageResource(inbo.imagen)
            nombre.setText(inbo.nombre)
            mensaje.setText(inbo.mensaje)

            return vista

        }
    }


}