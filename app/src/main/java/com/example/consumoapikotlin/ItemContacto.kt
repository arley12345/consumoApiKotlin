package com.example.consumoapikotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ItemContacto : AppCompatActivity() {
    private var itemNombre: TextView? = null
    private var itemTelefono: TextView? = null
    private var itemEmail: TextView? = null
    private lateinit var itemContactos: Contactos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_contacto)

        title = javaClass.simpleName
        itemNombre = findViewById(R.id.itemNombre)
        itemTelefono = findViewById(R.id.itemTelefono)
        itemEmail = findViewById(R.id.itemEmail)

        initValues()
    }

    private fun initValues() {
        itemContactos = (intent.extras!!.getSerializable("itemContacto") as Contactos)
        itemNombre!!.setText(itemContactos.name)
        itemTelefono!!.setText(itemContactos.phone)
        itemEmail!!.setText(itemContactos.email)
    }


}