package com.dicoding.mysimplecleanarchitecture.data

import com.dicoding.mysimplecleanarchitecture.domain.MessageEntity
import com.dicoding.mysimplecleanarchitecture.domain.MessageRepository

class MessageRepositoryImpl : MessageRepository {
    override fun getWelcomeMessage(name: String) = MessageEntity("Hello $name! Welcome to Clean Architecture")
}