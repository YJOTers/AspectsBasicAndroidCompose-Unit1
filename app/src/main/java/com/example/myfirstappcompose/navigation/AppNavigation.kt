package com.example.myfirstappcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myfirstappcompose.screens.Screen5
import com.example.myfirstappcompose.screens.Screen1
import com.example.myfirstappcompose.screens.Screen4
import com.example.myfirstappcompose.screens.Screen2
import com.example.myfirstappcompose.screens.Screen3

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.Screen1.route) {
        composable(route = AppScreens.Screen1.route) {
            Screen1(navController)
        }
        composable(route = AppScreens.Screen2.route) {
            Screen2(navController)
        }
        composable(route = AppScreens.Screen3.route) {
            Screen3(navController)
        }
        composable(route = AppScreens.Screen4.route) {
            Screen4(navController)
        }
        composable(route = AppScreens.Screen5.route) {
            Screen5(navController)
        }
    }
}