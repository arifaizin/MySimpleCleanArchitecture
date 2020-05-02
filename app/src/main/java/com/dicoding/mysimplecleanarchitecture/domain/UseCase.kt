package com.dicoding.mysimplecleanarchitecture.domain

abstract class UseCase<out Type, in Params> where Type : Any {

    abstract fun run(params: Params): MessageEntity

    operator fun invoke(params: Params, onResult: (MessageEntity) -> Unit = {}) {
        onResult(run(params))
    }

    class None
}