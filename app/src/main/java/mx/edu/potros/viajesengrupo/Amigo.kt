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

class Amigo : AppCompatActivity() {

    var amigos: ArrayList<Amigos> = ArrayList<Amigos>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amigo)


        agregarAmigos()

        var listview: ListView = findViewById(R.id.amigos_lv) as ListView
        var adaptador : AdaptadorAmigos = AdaptadorAmigos(this, amigos)
        listview.adapter = adaptador

    }

    fun agregarAmigos(){
        amigos.add(Amigos(R.drawable.round_circle,"Daniel",""))
        amigos.add(Amigos(R.drawable.round_circle,"Miguel",""))
        amigos.add(Amigos(R.drawable.round_circle,"Josue",""))
        amigos.add(Amigos(R.drawable.round_circle,"Andrea",""))
    }

    private class AdaptadorAmigos: BaseAdapter {
        var amigos=ArrayList<Amigos>()
        var contexto: Context?=null

        constructor(contexto: Context, amigos: ArrayList<Amigos>){
            this.amigos=amigos
            this.contexto=contexto
        }

        override fun getCount(): Int {
            return amigos.size
        }

        override fun getItem(position: Int): Any {
            return amigos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var amig=amigos[position]
            var inflador= LayoutInflater.from(contexto)
            var vista=inflador.inflate(R.layout.seleccion_amigos_view, null)

            var nombre=vista.findViewById(R.id.select_amigos_nombre_tv) as TextView
            var imagen=vista.findViewById(R.id.select_amigos_img) as ImageView


            nombre.setText(amig.nombre)
            imagen.setImageResource(amig.imagen)

            return vista

        }
    }



}