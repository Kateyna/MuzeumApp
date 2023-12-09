package com.example.muzz123.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.muzz123.API.YandexMapComponent
import com.example.muzz123.Page.MainList
import com.example.muzz123.Page.ProfileScene

@Composable
fun NavGraph(
    navHostController: NavHostController
){
    NavHost(navController = navHostController, startDestination = "screen_2" ){
        composable("screen_2"){
            MainList()
        }
        composable("screen_1"){
            YandexMapComponent()
        }
        composable("screen_3"){
            ProfileScene()
        }
    }
}