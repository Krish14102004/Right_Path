package com.example.right_path.data.model

data class ApprovalHistory(
    val historyId: String = "",
    val requestType: String = "",
    val childId: String = "",
    val parentId: String = "",
    val status: String = "",
    val timestamp: Long = 0L
)