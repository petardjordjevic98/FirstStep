package com.example.firststep.fragments.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firststep.R
import com.example.firststep.data.User
import kotlinx.android.synthetic.main.custom_row.view.*

class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>(){

    private var usersList = emptyList<User>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_row,parent,false))
    }

    override fun getItemCount(): Int {
return usersList.size    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem =usersList[position]

        holder.itemView.id_txt.text = currentItem.id.toString()
        holder.itemView.firstName_txt.text = currentItem.firstName
        holder.itemView.SecondName_txt.text = currentItem.LastName
        holder.itemView.age_txt.text = currentItem.age.toString()

    }

    fun setData ( users : List<User>)
    {
        this.usersList = users
        notifyDataSetChanged()
    }


}