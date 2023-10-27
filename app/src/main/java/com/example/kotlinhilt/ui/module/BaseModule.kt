package com.example.kotlinhilt.ui.module

import com.example.kotlinhilt.ui.baseinterface.RepositoryInterface
import com.example.kotlinhilt.ui.repository.MainRepository
import com.example.kotlinhilt.ui.repository.SubRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class BaseModule {


    // Main, Sub Repository 는 Interface 를 상속한 BaseRepository 로 안전하게 바꿀수 있다
    @Binds
    abstract fun bindRepository(subRepository: SubRepository): RepositoryInterface
}