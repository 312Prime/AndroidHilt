package com.example.kotlinhilt.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.kotlinhilt.ui.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository) : ViewModel() {

    fun getMainName(): String {
        return mainRepository.getMainName()
    }

    fun getSubName(): String {
        return mainRepository.getSubName()
    }
}