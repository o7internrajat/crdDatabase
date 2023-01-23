package com.example.crddatabase.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.crddatabase.R
import com.example.crddatabase.model.UserData

class UserAdapter(var c:Context, var userList:ArrayList<UserData>):
    RecyclerView.Adapter<UserAdapter.viewHolder>() {


    inner class viewHolder(var v: View):RecyclerView.ViewHolder(v) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val v= inflater.inflate(R.layout.item_list,parent,false)
        return viewHolder(v)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return userList.size

    }
}