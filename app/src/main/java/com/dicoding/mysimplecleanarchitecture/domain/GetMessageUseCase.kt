package com.dicoding.mysimplecleanarchitecture.domain

class GetMessageUseCase(private val messageRepository: MessageRepository) :
    UseCase<String, String>() {

    override fun run(params: String): String {
        return messageRepository.getWelcomeMessage(params)
    }
}