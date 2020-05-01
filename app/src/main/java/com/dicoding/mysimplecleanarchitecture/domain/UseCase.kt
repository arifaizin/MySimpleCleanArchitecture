package com.dicoding.mysimplecleanarchitecture.domain

import androidx.lifecycle.LiveData

abstract class UseCase<out Type, in Params> where Type : Any {

    abstract fun run(params: Params): String

    operator fun invoke(params: Params, onResult: (String) -> Unit = {}) {
        onResult(run(params))
    }

    class None
}