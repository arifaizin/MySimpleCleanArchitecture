package com.dicoding.mysimplecleanarchitecture.di

import com.dicoding.mysimplecleanarchitecture.data.MessageRepositoryImpl
import com.dicoding.mysimplecleanarchitecture.domain.GetMessageUseCase

object Injection {
    fun provideUseCase(): GetMessageUseCase {
        val messageRepository = MessageRepositoryImpl()
        return GetMessageUseCase(messageRepository)
    }
}
