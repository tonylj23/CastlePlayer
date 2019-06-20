package com.castle.player.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.castle.player.widget.HomeItemView
import java.sql.Array

class HomeAdpter : RecyclerView.Adapter<HomeAdpter.HomeHolder>() {
    private var list=ArrayList<HomeItemBean>()
    fun updateList(list:List<HomeItemView>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }
    override fun onBindViewHolder(holder: HomeHolder?, position: Int) {

    }

    class HomeHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): HomeHolder {
        return HomeHolder(HomeItemView(parent?.context))
    }


}