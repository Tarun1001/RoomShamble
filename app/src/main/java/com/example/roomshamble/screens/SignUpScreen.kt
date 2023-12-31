package com.example.roomshamble.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.roomshamble.R
import com.example.roomshamble.components.ButtonComponent
import com.example.roomshamble.components.CheckBoxComponent
import com.example.roomshamble.components.ClickableLoginTextComponent
import com.example.roomshamble.components.DividerTextComponent
import com.example.roomshamble.components.HeadingTextComponent
import com.example.roomshamble.components.MyTextFieldComponent
import com.example.roomshamble.components.NormalTextComponent
import com.example.roomshamble.components.PasswordFieldComponent
import com.example.roomshamble.navigation.RoomShambleRouter
import com.example.roomshamble.navigation.Screen


@Composable
fun SignUpScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(R.string.hey_there))
            HeadingTextComponent(stringResource(R.string.create_an_account))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(
                labelValue = stringResource(R.string.first_name),
                painterResource(id = R.drawable.baseline_person)
            )
            MyTextFieldComponent(
                labelValue = stringResource(R.string.last_name),
                painterResource = painterResource(id = R.drawable.baseline_person)
            )
            MyTextFieldComponent(
                labelValue = stringResource(R.string.email_id),
                painterResource = painterResource(id = R.drawable.baseline_person)
            )
            PasswordFieldComponent(
                labelValue = stringResource(R.string.password),
                painterResource = painterResource(id = R.drawable.baseline_person)
            )
            CheckBoxComponent(stringResource(id = R.string.terms_and_conditions))
            Spacer(modifier = Modifier.height(80.dp))
            ButtonComponent(stringResource(R.string.register))
            Spacer(modifier = Modifier.height(20.dp))
            DividerTextComponent()
            ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
                RoomShambleRouter.navigateTo(Screen.LoginScreen)
            })
        }

    }

}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}
