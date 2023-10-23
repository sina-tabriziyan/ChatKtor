package com.sina.chat.data.remote.dto

import com.sina.chat.domain.model.Message
import kotlinx.serialization.Serializable
import java.text.DateFormat
import java.util.Date

@Serializable
data class MessageDto(
    val text: String,
    val timestamp: Long,
    val username: String,
    val id: String
) {
    fun toMessage(): Message {
        val date = Date(timestamp)
        val formattedDate = DateFormat.getDateInstance(DateFormat.DEFAULT)
            .format(date)
        return Message(
            text = text,
            formatedTime = formattedDate,
            username = username
        )
    }
}
