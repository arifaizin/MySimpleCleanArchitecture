package com.dicoding.mysimplecleanarchitecture.data

import com.dicoding.mysimplecleanarchitecture.domain.MessageRepository

class MessageRepositoryImpl : MessageRepository {
    override fun getWelcomeMessage(name: String) = "Hello $name! Welcome to Clean Architecture"
}