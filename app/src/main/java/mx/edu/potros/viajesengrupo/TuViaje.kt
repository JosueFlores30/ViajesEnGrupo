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

class TuViaje : AppCompatActivity() {

    var tuViajes: ArrayList<Viajes> = ArrayList<Viajes>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tu_viaje)
        agregarViajes()
        var listview: ListView = findViewById(R.id.listview_tu_viaje) as ListView
        var adaptador: TuViaje.AdaptadorViajes = TuViaje.AdaptadorViajes(this, tuViajes)
        listview.adapter = adaptador
    }

    fun agregarViajes(){
        tuViajes.add(Viajes("Guadalajara, Jalisco",R.drawable.guadalajara,R.drawable.round_circle,"Fechas", "Del 20 a 25 de marzo."))

    }

    private class AdaptadorViajes: BaseAdapter {
        var viajes=ArrayList<Viajes>()
        var contexto: Context?=null

        constructor(contexto: Context, viajes: ArrayList<Viajes>){
            this.viajes=viajes
            this.contexto=contexto
        }

        override fun getCount(): Int {
            return viajes.size
        }

        override fun getItem(position: Int): Any {
            return viajes[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var viaj=viajes[position]
            var inflador= LayoutInflater.from(contexto)
            var vista=inflador.inflate(R.layout.tu_viaje_view, null)
            var lugar=vista.findViewById(R.id.tu_viaje_lugar_tv) as TextView
            var imagen=vista.findViewById(R.id.tu_viaje_imagen_iv) as ImageView
            var fecha=vista.findViewById(R.id.tu_viaje_rango_fechas_tv) as TextView
            var amigos=vista.findViewById(R.id.amigo1_tu_viaje) as ImageView

            lugar.setText(viaj.lugar)
            imagen.setImageResource(viaj.imagen)
            amigos.setImageResource(viaj.amigos)
            fecha.setText(viaj.fechas)

            return vista

        }
    }


}