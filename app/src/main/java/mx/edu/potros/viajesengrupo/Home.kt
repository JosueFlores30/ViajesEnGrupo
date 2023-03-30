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

class Home : AppCompatActivity() {

//    var viajes: ArrayList<Viajes> = ArrayList<Viajes>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        agregarViajes()
//
//        var listview: ListView=findViewById(R.id.listview_home)
//
//        var adaptadpr: AdaptadorViajes = AdaptadorViajes(this, viajes)
//        listview.adapter = adaptadpr
    }

//    fun agregarViajes(){
//        viajes.add(Viajes("Guadalajara, Jalisco",R.drawable.guadalajara,R.drawable.round_circle, "",""))
//        viajes.add(Viajes("Monterrey, Nuevo León",R.drawable.monterrey,R.drawable.round_circle, "",""))
//    }
//
//    private class AdaptadorViajes: BaseAdapter {
//        var viajes=ArrayList<Viajes>()
//        var contexto: Context?=null
//
//        constructor(contexto: Context, viajes: ArrayList<Viajes>){
//            this.viajes=viajes
//            this.contexto=contexto
//        }
//
//        override fun getCount(): Int {
//            return viajes.size
//        }
//
//        override fun getItem(position: Int): Any {
//            return viajes[position]
//        }
//
//        override fun getItemId(position: Int): Long {
//            return position.toLong()
//        }
//
//        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//            var viaj=viajes[position]
//            var inflador=LayoutInflater.from(contexto)
//            var vista=inflador.inflate(R.layout.mis_viajes_view, null)
//
//            var lugar=vista.findViewById(R.id.mis_viajes_lugar_tv) as TextView
//            var imagen=vista.findViewById(R.id.mis_viajes_imagen_iv) as ImageView
//            var fecha=vista.findViewById(R.id.mis_viajes_rango_fechas_tv) as TextView
//            var amigos=vista.findViewById(R.id.amigo1) as ImageView
//            var fechas=vista.findViewById(R.id.fechas_mis_viajes) as TextView
//
//
//            lugar.setText(viaj.lugar)
//            imagen.setImageResource(viaj.imagen)
//            amigos.setImageResource(viaj.amigos)
//            fecha.setText(viaj.fechas)
//            fechas.setText(viaj.fechas)
//
//            return vista
//
//        }
//    }

}