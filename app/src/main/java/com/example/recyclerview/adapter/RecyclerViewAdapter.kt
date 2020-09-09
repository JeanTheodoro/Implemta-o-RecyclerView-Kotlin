package com.example.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.model.Nota
import com.example.recyclerview.R

class RecyclerViewAdapter(val list: List<Nota>, val context: Context):
RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val notas = list[position]

        holder.apply {
            titulo.text = notas.titulo
            descricao.text = notas.descicao
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titulo: TextView = itemView.findViewById(R.id.titulo)
        val descricao: TextView = itemView.findViewById(R.id.descricao)
    }

}