package com.example.cryptocurrencies.domain.use_cases.get_coin

import com.example.cryptocurrencies.common.Resource
import com.example.cryptocurrencies.data.remote.dto.toCoin
import com.example.cryptocurrencies.data.remote.dto.toCoinDetail
import com.example.cryptocurrencies.domain.model.Coin
import com.example.cryptocurrencies.domain.model.CoinDetail
import com.example.cryptocurrencies.domain.repositories.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading<CoinDetail>())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success<CoinDetail>(coin))
        } catch (e: HttpException) {
            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "error"))
        } catch (e: IOException) {
            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "error"))
        }
    }
}