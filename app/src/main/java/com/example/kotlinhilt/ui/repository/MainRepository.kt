package com.example.kotlinhilt.ui.repository

import com.example.kotlinhilt.ui.baseinterface.RepositoryInterface
import javax.inject.Inject

class MainRepository @Inject constructor() : RepositoryInterface {

    private val mainName = "Main Activity by MainRepository"
    private val subName = "Sub Activity by MainRepository"

    override fun getMainName(): String {
        return mainName
    }

    override fun getSubName(): String {
        return subName
    }
}