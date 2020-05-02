package com.dicoding.mysimplecleanarchitecture.data

import com.dicoding.mysimplecleanarchitecture.domain.MessageEntity

interface MessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}