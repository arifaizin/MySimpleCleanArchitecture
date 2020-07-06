package com.dicoding.mysimplecleanarchitecture.domain

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetMessageUseCaseTest {

    private lateinit var getMessage: MessageUseCase

    @Mock private lateinit var messageRepository: IMessageRepository

    @Before
    fun setUp() {
        getMessage = MessageInteractor(messageRepository)
        val dummyMessage = MessageEntity("Hello $NAME Welcome to Clean Architecture")
        `when`(messageRepository.getWelcomeMessage(NAME)).thenReturn(dummyMessage)
    }

    @Test fun `should get data from repository`() {
        getMessage.getMessage(NAME)

        verify(messageRepository).getWelcomeMessage(NAME)
        verifyNoMoreInteractions(messageRepository)
    }

    companion object {
        const val NAME = "Dicoding"
    }
}