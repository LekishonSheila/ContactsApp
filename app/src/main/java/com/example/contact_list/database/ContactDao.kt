package com.example.contact_list.database

import android.provider.ContactsContract.Contacts
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.contact_list.model.ContactData


@Dao
interface ContactDao {
  @Insert(onConflict = OnConflictStrategy.REPLACE)
  fun insertContact(contact: ContactData)
}