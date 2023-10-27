package com.example.kotlinhilt.ui.repository

import javax.inject.Inject

class MainRepository @Inject constructor() {

    private val mainName = "Main Activity"
    private val subName = "Sub Activity"

    fun getMainName(): String {
        return mainName
    }

    fun getSubName(): String {
        return subName
    }
}