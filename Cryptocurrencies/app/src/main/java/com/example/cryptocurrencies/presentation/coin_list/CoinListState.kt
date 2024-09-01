package com.example.cryptocurrencies.presentation.coin_list

import com.example.cryptocurrencies.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
