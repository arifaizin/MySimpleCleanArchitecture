package com.dicoding.mysimplecleanarchitecture.domain

class GetMessageUseCase(private val messageRepository: MessageRepository) {
    operator fun invoke(name: String) = messageRepository.getWelcomeMessage(name)
}