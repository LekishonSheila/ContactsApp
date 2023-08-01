package com.example.contact_list.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_list.R
import com.example.contact_list.model.ContactData


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Create a list of contacts
        val contacts = mutableListOf(
            ContactData(contactId = 0, firstName = "Sheila ", email = "lekishonsheila@gmail.com", phoneNumber = "+254768453", imageResId = R.drawable.avator),
            ContactData(contactId = 0, firstName = "Sheila ", email = "lekishonsheila@gmail.com", phoneNumber = "+254768453", imageResId = R.drawable.avator),
            ContactData(contactId = 0, firstName = "Brenda", email = "brendakaleku@gmail.com", phoneNumber = "+25678945678", imageResId = R.drawable.avator),
            ContactData(contactId = 0, firstName = "Mercy", email = "mercybee@gmail.com", phoneNumber = "0734562437", imageResId = R.drawable.avator),
            ContactData(contactId = 0, firstName = "Rita", email = "ritashee@gmail.com", phoneNumber = "07548972345", imageResId = R.drawable.avator),
            ContactData(contactId = 0, firstName = "Emma", email = "emmacherie@gmail.com", phoneNumber = "0729429186", imageResId = R.drawable.avator),
            ContactData(contactId = 0, firstName = "Faith", email = "faithkurao@gmai.com", phoneNumber = "0712345678", imageResId = R.drawable.avator),
            ContactData(contactId = 0, firstName = "Gift", email = "giftleyian@gmail.com", phoneNumber = "0789456745", imageResId = R.drawable.avator)


        )


        val recyclerView = findViewById<RecyclerView>(R.id.rvContact)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContactRvAdapter(contacts)
    }
}