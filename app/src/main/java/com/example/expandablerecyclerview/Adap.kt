package com.example.expandablerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adap(val tableList: List<list>):RecyclerView.Adapter<Adap.ViewHolder>() {
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var first:TextView=itemView.findViewById(R.id.first)
        var second:TextView=itemView.findViewById(R.id.second)
        var third:TextView=itemView.findViewById(R.id.third)
        var linearlayout:LinearLayout=itemView.findViewById(R.id.linearlayout)
        var expandablelayout:TextView=itemView.findViewById(R.id.expandable_layout)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val table = tableList[position]
        holder.first.text=table.first
        holder.second.text=table.second
        holder.third.text=table.third

        val isExpandable:Boolean=tableList[position].expandable
        holder.expandablelayout.visibility=if (isExpandable) View.VISIBLE else View.GONE

        holder.linearlayout.setOnClickListener {
            val b=tableList[position]
            b.expandable=!b.expandable
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return tableList.size
    }
}