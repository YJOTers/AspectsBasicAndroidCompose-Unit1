package com.example.myfirstappcompose.navigation

sealed class AppScreens(val route: String) {
    object Screen1: AppScreens("Screen1")
    object Screen2: AppScreens("Screen2")
    object Screen3: AppScreens("Screen3")
    object Screen4: AppScreens("Screen4")
    object Screen5: AppScreens("Screen5")
}