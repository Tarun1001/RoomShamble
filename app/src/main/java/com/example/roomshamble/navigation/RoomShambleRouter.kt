package com.example.roomshamble.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen{
    object  SignUpScreen : Screen()
    object LoginScreen : Screen()
    object  TermsAndConditions: Screen()
}
object RoomShambleRouter {
    var currentScreen: MutableState<Screen> = mutableStateOf(Screen.SignUpScreen)
    fun  navigateTo(destination: Screen){
        currentScreen.value= destination
    }
}