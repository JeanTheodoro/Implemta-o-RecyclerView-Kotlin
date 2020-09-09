package com.example.recyclerview.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.adapter.RecyclerViewAdapter
import com.example.recyclerview.model.Nota

class MainActivity : AppCompatActivity() {

    var list: MutableList<Nota> = emptyList<Nota>().toMutableList()
    private lateinit var recyclerView: RecyclerView;
    private lateinit var  adapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        list.add(
            Nota(
                "Correr",
                "Correr 1k após acordar"
            )
        )
        list.add(
            Nota(
                "Estudar",
                "Orientação Objetos com Kotlin"
            )
        )
        list.add(
            Nota(
                "Programar",
                "Programar o App TodoList"
            )
        )
        list.add(
            Nota(
                "Fazer Almoço",
                "Preparar  um almoços com proteina e vegetais"
            )
        )
        list.add(
            Nota(
                "Programar ",
                "Retomar a implemtação do App TodoList"
            )
        )
        list.add(
            Nota(
                "Estudar ",
                "Testes unitários"
            )
        )
        list.add(
            Nota(
                "Fazer o jantar ",
                "Preparar o jantar"
            )
        )


        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        adapter = RecyclerViewAdapter(list, this)
        recyclerView.adapter  = adapter
        recyclerView.setHasFixedSize(true)

    }
}