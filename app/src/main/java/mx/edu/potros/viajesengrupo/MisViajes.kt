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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MisViajes : AppCompatActivity() {


//    var misViajes: ArrayList<Viajes> = ArrayList<Viajes>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mis_viajes)


//        agregarViajes()
//
//        var listview: ListView = findViewById(R.id.mis_viajes_lv) as ListView
//
//        var adaptador: AdaptadorViajes = AdaptadorViajes(this,misViajes)
//        listview.adapter = adaptador

    }

//
//    fun agregarViajes(){
//        misViajes.add(Viajes("Guadalajara, Jalisco",R.drawable.guadalajara,R.drawable.round_circle,"Fechas", "Del 20 a 25 de marzo."))
//        misViajes.add(Viajes("Monterrey, Nuevo León",R.drawable.monterrey,R.drawable.round_circle,"Fechas", "Del 11 a 15 de junio."))
//        misViajes.add(Viajes("Cd. México, México.",R.drawable.cdmx,R.drawable.round_circle,"Fechas", "Del 11 a 14 de febrero."))
//
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
//            var inflador= LayoutInflater.from(contexto)
//            var vista=inflador.inflate(R.layout.mis_viajes_view, null)
//
//            var lugar=vista.findViewById(R.id.mis_viajes_lugar_tv) as TextView
//            var imagen=vista.findViewById(R.id.mis_viajes_imagen_iv) as ImageView
//            var fecha=vista.findViewById(R.id.mis_viajes_rango_fechas_tv) as TextView
//            var amigos=vista.findViewById(R.id.amigo1) as ImageView
//
//            lugar.setText(viaj.lugar)
//            imagen.setImageResource(viaj.imagen)
//            amigos.setImageResource(viaj.amigos)
//            fecha.setText(viaj.fechas)
//
//            return vista
//
//        }
//    }



}