package com.example.dagger_hilt_basic_app

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideCryptocurrencyRepository(): CryptocurrencyRepository = CryptocurrencyRepositoryImpl()
}