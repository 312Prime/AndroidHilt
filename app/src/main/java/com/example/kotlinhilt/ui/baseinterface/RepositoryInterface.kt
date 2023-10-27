package com.example.kotlinhilt.ui.baseinterface

        //interface 내에서 사용할 함수를 override 할 수 있게 명시한다.
interface RepositoryInterface {
    fun getMainName(): String

    fun getSubName(): String

}