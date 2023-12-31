package com.example.roomshamble.screens

import androidx.compose.runtime.Composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.ui.Alignment
import com.example.roomshamble.R
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.roomshamble.components.ButtonComponent
import com.example.roomshamble.components.ClickableLoginTextComponent
import com.example.roomshamble.components.DividerTextComponent
import com.example.roomshamble.components.HeadingTextComponent
import com.example.roomshamble.components.MyTextFieldComponent
import com.example.roomshamble.components.NormalTextComponent
import com.example.roomshamble.components.PasswordFieldComponent
import com.example.roomshamble.components.UnderLinedTextComponent
import com.example.roomshamble.navigation.RoomShambleRouter
import com.example.roomshamble.navigation.Screen
import com.example.roomshamble.navigation.SystemBackButtonHandler


@Composable
fun LoginScreen(
    //oginViewModel: LoginViewModel = viewModel()
) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(28.dp)
        ) {

            Column( 
                modifier = Modifier
                    .fillMaxSize()
            ) {

                NormalTextComponent(value = stringResource(id = R.string.login ))
                HeadingTextComponent(value = stringResource(id =R.string.welcome_back ))
                Spacer(modifier = Modifier.height(20.dp))

                MyTextFieldComponent(labelValue = stringResource(id = R.string.email),
                    painterResource(id = R.drawable.message),
                   /* onTextChanged = {
                        loginViewModel.onEvent(LoginUIEvent.EmailChanged(it))
                    },
                    errorStatus = loginViewModel.loginUIState.value.emailError*/
                )

                PasswordFieldComponent(
                    labelValue = stringResource(id = R.string.password),
                    painterResource(id = R.drawable.baseline_person),
                   /* onTextSelected = {
                        loginViewModel.onEvent(LoginUIEvent.PasswordChanged(it))
                    },
                    errorStatus = loginViewModel.loginUIState.value.passwordError*/
                )

                Spacer(modifier = Modifier.height(40.dp))
                UnderLinedTextComponent(value = stringResource(id = R.string.forgot_password))

                Spacer(modifier = Modifier.height(40.dp))

                ButtonComponent(
                    value = stringResource(id = R.string.login),
                    /*onButtonClicked = {
                        loginViewModel.onEvent(LoginUIEvent.LoginButtonClicked)
                    },
                    isEnabled = loginViewModel.allValidationsPassed.value*/
                )

                Spacer(modifier = Modifier.height(20.dp))

                DividerTextComponent()

                ClickableLoginTextComponent(tryingToLogin = false, onTextSelected = {
                    RoomShambleRouter.navigateTo(Screen.SignUpScreen)
                })
            }
        }

       /* if(loginViewModel.loginInProgress.value) {
            CircularProgressIndicator()
        }*/
    }


    SystemBackButtonHandler {
        RoomShambleRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}