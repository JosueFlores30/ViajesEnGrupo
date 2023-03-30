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

class ToDoList : AppCompatActivity() {

    var lista: ArrayList<Listtodo> = ArrayList<Listtodo>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do_list)


        agregarLista()

        var listview: ListView = findViewById(R.id.to_do_list_lv) as ListView

        var adaptador: AdaptadorLista = AdaptadorLista(this, lista)
        listview.adapter = adaptador
    }

    fun agregarLista(){
        lista.add(Listtodo("Agregar amigos"))
        lista.add(Listtodo("Crear eventos de los días de viaje"))
        lista.add(Listtodo("Asignar eventos"))
        lista.add(Listtodo("Revisar inbox"))
        lista.add(Listtodo("Buscar hotel"))
    }

    private class AdaptadorLista: BaseAdapter {
        var listas=ArrayList<Listtodo>()
        var contexto: Context?=null

        constructor(contexto: Context, listas: ArrayList<Listtodo>){
            this.listas=listas
            this.contexto=contexto
        }

        override fun getCount(): Int {
            return listas.size
        }

        override fun getItem(position: Int): Any {
            return listas[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var lista=listas[position]
            var inflador= LayoutInflater.from(contexto)
            var vista=inflador.inflate(R.layout.to_do_list_view, null)

            var text=vista.findViewById(R.id.to_do_list_tv) as TextView

            text.setText(lista.lista)

            return vista

        }
    }
}