package com.example.right_path.data.model

data class User(
    val id: String = "",
    val name: String = "",
    val email: String = "",
    val role: String = "" // "parent" or "child"
)