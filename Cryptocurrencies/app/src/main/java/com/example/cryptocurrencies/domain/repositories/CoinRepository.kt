package com.example.cryptocurrencies.domain.repositories

import com.example.cryptocurrencies.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencies.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}