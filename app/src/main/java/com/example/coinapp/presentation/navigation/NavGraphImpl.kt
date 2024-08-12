package com.example.coinapp.presentation.navigation

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.coinapp.presentation.detailscreen.DetailScreen
import com.example.coinapp.presentation.detailscreen.DetailViewModel
import com.example.coinapp.presentation.detailscreen.components.DetailErrorScreen
import com.example.coinapp.presentation.mainscreen.MainScreen
import com.example.coinapp.presentation.mainscreen.MainViewModel
import com.example.coinapp.presentation.model.toCoinUiModel
import com.example.coinapp.presentation.utils.ResultState
import com.example.coinapp.ui.theme.orangeColor

@Composable
fun NavGraphImpl() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.MainScreen) {
        composable<Screens.MainScreen> {
            val viewModel: MainViewModel = hiltViewModel()
            MainScreen(
                viewModel = viewModel,
                navigateToDetail = { coinId ->
                    navController.navigate(Screens.DetailScreen(id = coinId))
                }
            )
        }
        composable<Screens.DetailScreen> {
            val viewModel: DetailViewModel = hiltViewModel()
            val args = it.toRoute<Screens.DetailScreen>()
            Log.d("MyLog", args.id)

            LaunchedEffect(Unit) {
                viewModel.fetchCoinById(args.id)
            }

            when (val coin = viewModel.coin.collectAsState().value) {
                is ResultState.Error -> {
                    DetailErrorScreen(
                        onBackClick = { navController.navigateUp() },
                        onButtonClick = { viewModel.fetchCoinById(args.id) })
                }

                ResultState.Loading -> {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator(color = orangeColor)
                    }
                }

                is ResultState.Success -> {
                    val uiCoin = coin.data.toCoinUiModel()
                    Log.d("MyLog", uiCoin.toString())
                    DetailScreen(
                        model = uiCoin,
                        title = uiCoin.name,
                        onBackClick = { navController.popBackStack() })
                }
            }
        }
    }
}