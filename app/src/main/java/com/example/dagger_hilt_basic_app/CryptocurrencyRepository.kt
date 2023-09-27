package com.example.dagger_hilt_basic_app

interface CryptocurrencyRepository {
    fun getCryptocurrency() : List<Cryptocurrency>
}