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

class Notificaciones : AppCompatActivity() {

    var notificaciones: ArrayList<Notifications> = ArrayList<Notifications>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notificaciones)

        agregarNotificacion()

        var listview: ListView = findViewById(R.id.listViewInbox) as ListView

        var adapador: AdaptadorNotificaciones = AdaptadorNotificaciones(this, notificaciones)
        listview.adapter = adapador


    }

    fun agregarNotificacion(){
        notificaciones.add(Notifications(R.drawable.round_circle, "Guadalajara", "Fátima Macias agregó algo en el Día 1 de Guadalajara"))
        notificaciones.add(Notifications(R.drawable.round_circle, "Guadalajara", "Isaac Perez marcó una actividad realizada en el To-do list de Guadalajara"))
    }

    private class AdaptadorNotificaciones: BaseAdapter{
        var notificaciones=ArrayList<Notifications>()
        var contexto: Context?=null

        constructor(contexto: Context, notificaciones: ArrayList<Notifications>){
            this.notificaciones=notificaciones
            this.contexto=contexto
        }

        override fun getCount(): Int {
            return notificaciones.size
        }

        override fun getItem(position: Int): Any {
            return notificaciones[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var notf=notificaciones[position]
            var inflador=LayoutInflater.from(contexto)
            var vista=inflador.inflate(R.layout.notificaciones_view, null)

            var img=vista.findViewById(R.id.notificaciones_img) as ImageView
            var lugar=vista.findViewById(R.id.tv_nombre_notificaciones) as TextView
            var desc=vista.findViewById(R.id.tv_mensajes_notificaciones) as TextView

            img.setImageResource(notf.img)
            lugar.setText(notf.lugar)
            desc.setText(notf.descripcion)
            return vista

        }

    }




}