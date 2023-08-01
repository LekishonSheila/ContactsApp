package com.example.contact_list.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_list.R
import com.example.contact_list.model.ContactData


class  ContactRvAdapter(private val contactList: List<ContactData>) :
    RecyclerView.Adapter<ContactRvAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_list_item, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contactList[position]
        holder.itemView.findViewById<ImageView>(R.id.ivAvator).setImageResource(contact.imageResId)
        holder.itemView.findViewById<TextView>(R.id.tvName).text = contact.firstName
        holder.itemView.findViewById<TextView>(R.id.tvEmail).text = contact.email
        holder.itemView.findViewById<TextView>(R.id.tvPhoneNumber).text = contact.phoneNumber
//        picasso.get().load(contact.imageResId).into(binding.ivContact)
    }
    override fun getItemCount(): Int{
        return contactList.size
    }
}