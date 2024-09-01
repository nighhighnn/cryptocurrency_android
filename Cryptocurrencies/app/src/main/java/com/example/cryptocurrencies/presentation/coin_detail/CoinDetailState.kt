package com.example.cryptocurrencies.presentation.coin_detail

import com.example.cryptocurrencies.domain.model.Coin
import com.example.cryptocurrencies.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
