package com.example.roomshamble.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.roomshamble.navigation.RoomShambleRouter
import com.example.roomshamble.navigation.Screen
import com.example.roomshamble.screens.LoginScreen
import com.example.roomshamble.screens.SignUpScreen

@Composable
fun PostOfficeApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Crossfade(targetState = RoomShambleRouter.currentScreen, label = "") {
            currentState ->
            when(currentState.value){
                is Screen.SignUpScreen->{
                    SignUpScreen()
                }
                is Screen.LoginScreen->{
                    LoginScreen()
                }

                else -> {}
            }

        }

    }
}