package com.dicoding.mysimplecleanarchitecture.domain

class GetMessageUseCase(private val messageRepository: MessageRepository) :
    UseCase<MessageEntity, String>() {

    override fun run(params: String): MessageEntity {
        return messageRepository.getWelcomeMessage(params)
    }

}