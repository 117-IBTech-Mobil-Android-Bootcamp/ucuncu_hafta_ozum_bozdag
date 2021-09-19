package com.info.bootcampweekthree

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val imageList:List<Avatar>):RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.grid_avatar,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val avatar : Avatar = imageList.get(position)
        holder.avatarImg.setImageResource(avatar.iconSrc!!)
    }

    override fun getItemCount(): Int = this.imageList.size
}

class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    val avatarImg = itemView.findViewById<AppCompatImageView>(R.id.recycle_avatar)
    val cardAvatar=itemView.findViewById<CardView>(R.id.recycle_card)
    val selected=itemView.findViewById<CheckBox>(R.id.radioButton)


}