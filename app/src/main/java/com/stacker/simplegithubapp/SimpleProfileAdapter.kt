package com.stacker.simplegithubapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SimpleProfileAdapter : RecyclerView.Adapter<SimpleProfileAdapter.ViewHolder>() {

    val ProfileItems = ArrayList<SimpleProfile>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleProfileAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.recyclerview_simpleprofile, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = ProfileItems.size

    override fun onBindViewHolder(holder: SimpleProfileAdapter.ViewHolder, position: Int) {
        val data = ProfileItems[position]

        holder.tvId.text = data.id
        holder.tvUpdated.text = data.updated
        holder.tvCompany.text = data.company
    }

    fun initSimpleProfileItems(profiles : List<SimpleProfile>){
        ProfileItems.addAll(profiles)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvId = itemView.findViewById(R.id.item_txtProfileID) as TextView
        val tvUpdated = itemView.findViewById(R.id.item_txtProfileUpdated) as TextView
        val tvCompany = itemView.findViewById(R.id.item_txtProfileCompany) as TextView
        val tvImgURL = itemView.findViewById<ImageView>(R.id.item_imageView)
    }
}