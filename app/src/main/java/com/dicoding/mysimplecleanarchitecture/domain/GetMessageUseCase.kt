package com.dicoding.mysimplecleanarchitecture.domain

class GetMessageUseCase(private val messageRepository: IMessageRepository) :
    UseCase<MessageEntity, String>() {

    override fun run(params: String): MessageEntity = messageRepository.getWelcomeMessage(params)

}