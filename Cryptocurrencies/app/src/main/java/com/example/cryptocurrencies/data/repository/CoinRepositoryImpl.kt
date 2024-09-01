package com.example.cryptocurrencies.data.repository

import com.example.cryptocurrencies.data.remote.CoinPaprikaApi
import com.example.cryptocurrencies.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencies.data.remote.dto.CoinDto
import com.example.cryptocurrencies.domain.repositories.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}