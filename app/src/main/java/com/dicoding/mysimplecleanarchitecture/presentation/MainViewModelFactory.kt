package com.dicoding.mysimplecleanarchitecture.presentation

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dicoding.mysimplecleanarchitecture.di.Injection
import com.dicoding.mysimplecleanarchitecture.domain.GetMessageUseCase

class MainViewModelFactory (
    private var getMessageUseCase: GetMessageUseCase
) : ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: MainViewModelFactory? = null

        fun getInstance(context: Context): MainViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: MainViewModelFactory(Injection.provideUseCase())
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(getMessageUseCase) as T
            else -> throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }
}