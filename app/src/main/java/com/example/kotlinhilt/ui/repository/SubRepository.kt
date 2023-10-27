package com.example.kotlinhilt.ui.repository

import com.example.kotlinhilt.ui.baseinterface.RepositoryInterface
import javax.inject.Inject

class SubRepository @Inject constructor() : RepositoryInterface {

    private val mainName = "Main Activity by SubRepository"
    private val subName = "Sub Activity by SubRepository"

    override fun getMainName(): String {
        return mainName
    }

    override fun getSubName(): String {
        return subName
    }
}