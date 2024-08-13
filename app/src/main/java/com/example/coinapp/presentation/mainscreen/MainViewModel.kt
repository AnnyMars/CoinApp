package com.example.coinapp.presentation.mainscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coinapp.data.model.coins.CoinsItem
import com.example.coinapp.domain.repository.CoinRepository
import com.example.coinapp.presentation.utils.ResultState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: CoinRepository
): ViewModel() {

    private val _coinsState = MutableStateFlow<ResultState<List<CoinsItem>>>(ResultState.Loading)
    val coinsState: StateFlow<ResultState<List<CoinsItem>>> = _coinsState

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing


    fun fetchCoins(currency: String) {
        viewModelScope.launch(Dispatchers.IO) {
            _isRefreshing.value = true
            _coinsState.value = ResultState.Loading
            _coinsState.value = repository.fetchCoins(currency)
            _isRefreshing.value = false
        }
    }

}