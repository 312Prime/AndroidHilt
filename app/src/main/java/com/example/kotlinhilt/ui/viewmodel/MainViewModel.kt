package com.example.kotlinhilt.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.kotlinhilt.ui.baseinterface.RepositoryInterface
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repositoryInterface: RepositoryInterface) : ViewModel() {

    // 명시한 함수를 가져와서 사용한다.
    fun getMainName(): String {
        return repositoryInterface.getMainName()
    }

    fun getSubName(): String {
        return repositoryInterface.getSubName()
    }
}