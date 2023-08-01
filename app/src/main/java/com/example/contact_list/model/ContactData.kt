package com.example.contact_list.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Contacts")
data class ContactData (
    @PrimaryKey(autoGenerate = true)var contactId:Int,
    var firstName:String,
    var email:String,
    var phoneNumber:String,
    var imageResId:Int
    )
