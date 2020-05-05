package com.dicoding.mysimplecleanarchitecture.di

import com.dicoding.mysimplecleanarchitecture.data.MessageDataSource
import com.dicoding.mysimplecleanarchitecture.data.MessageRepository
import com.dicoding.mysimplecleanarchitecture.domain.GetMessageUseCase

object Injection {
    fun provideUseCase(): GetMessageUseCase {
        val messageRepository = provideRepository()
        return GetMessageUseCase(messageRepository)
    }

    private fun provideRepository(): MessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): MessageDataSource {
        return MessageDataSource()
    }
}
