package com.dicoding.mysimplecleanarchitecture.domain

interface MessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}