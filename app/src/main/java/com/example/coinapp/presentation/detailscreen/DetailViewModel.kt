package com.example.coinapp.presentation.detailscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coinapp.data.model.coin.Coin
import com.example.coinapp.domain.repository.CoinRepository
import com.example.coinapp.presentation.utils.ResultState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val repository: CoinRepository
) : ViewModel() {

    private val _coin = MutableStateFlow<ResultState<Coin>>(ResultState.Loading)
    val coin: StateFlow<ResultState<Coin>> = _coin

    fun fetchCoinById(id: String) {
        viewModelScope.launch(Dispatchers.IO) {
            _coin.value = ResultState.Loading
            _coin.value = repository.fetchCoinById(id)
        }
    }

}