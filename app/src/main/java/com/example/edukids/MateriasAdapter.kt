package com.example.edukids

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MateriasAdapter(private val materias: List<TaskMaterias>) :
    RecyclerView.Adapter<MateriasViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriasViewHolder {

    }

    override fun getItemCount(): Int {
        return materias.size
    }

    override fun onBindViewHolder(holder: MateriasViewHolder, position: Int) {
        TODO("Not yet implemented") 
    }

}