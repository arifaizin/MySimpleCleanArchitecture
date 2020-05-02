package com.dicoding.mysimplecleanarchitecture.presentation

import androidx.lifecycle.ViewModel
import com.dicoding.mysimplecleanarchitecture.domain.GetMessageUseCase

class MainViewModel(private val getMessageUseCase: GetMessageUseCase) : ViewModel() {
    fun getMessage(name: String) = getMessageUseCase.run(name)
}