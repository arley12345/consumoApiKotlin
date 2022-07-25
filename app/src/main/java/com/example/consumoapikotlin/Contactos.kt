package com.example.consumoapikotlin

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Contactos(
    var name: String,
    var  email: String,
    var  phone: String

): Serializable

