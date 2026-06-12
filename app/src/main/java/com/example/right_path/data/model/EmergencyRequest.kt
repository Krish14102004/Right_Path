package com.example.right_path.data.model

data class EmergencyRequest(
    val requestId: String = "",
    val childId: String = "",
    val parentId: String = "",
    val reason: String = "",
    val requestTime: Long = 0L,
    val status: String = ""
)