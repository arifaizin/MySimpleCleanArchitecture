package com.dicoding.mysimplecleanarchitecture.data

import com.dicoding.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource {
    fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcome to Clean Architecture")
}