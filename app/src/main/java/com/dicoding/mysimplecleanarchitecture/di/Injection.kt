package com.dicoding.mysimplecleanarchitecture.di

import com.dicoding.mysimplecleanarchitecture.data.MessageDataSourceImpl
import com.dicoding.mysimplecleanarchitecture.data.MessageRepositoryImpl
import com.dicoding.mysimplecleanarchitecture.domain.GetMessageUseCase

object Injection {
    fun provideUseCase(): GetMessageUseCase {
        val messageRepository = provideRepository()
        return GetMessageUseCase(messageRepository)
    }

    private fun provideRepository(): MessageRepositoryImpl {
        val messageDataSource = provideDataSource()
        return MessageRepositoryImpl(messageDataSource)
    }

    private fun provideDataSource(): MessageDataSourceImpl {
        return MessageDataSourceImpl()
    }
}