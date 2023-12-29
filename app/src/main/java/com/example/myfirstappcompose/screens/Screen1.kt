package com.example.myfirstappcompose.screens

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myfirstappcompose.R
import com.example.myfirstappcompose.navigation.AppScreens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen1(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(stringResource(R.string.first_screen)) },
            actions = { Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = null,
                modifier = Modifier.clickable { navController.navigate(AppScreens.Screen2.route) }
            )}
        )
    }) {
        BirthDayCard(
            modifier = Modifier.padding(it)
        )
    }
}

@Composable
private fun BirthDayCard(modifier: Modifier = Modifier) {
    Box(modifier){
        BirthDayImage()
        BirthDayDescription()
    }
}

@Composable
private fun BirthDayImage(){
    val image = painterResource(id = R.drawable.androidparty)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        alpha = 0.5f
    )
}

@Composable
private fun BirthDayDescription(){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)) {
        LabelText(
            textId = R.string.Happy_Birthday_Text,
            fontSize = 80.sp,
            lineHeight = 80.sp,
        )
        LabelText(
            textId = R.string.signature_text,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
private fun LabelText(
    @StringRes textId: Int,
    modifier: Modifier = Modifier,
    fontSize: TextUnit,
    lineHeight: TextUnit = 20.sp,
    textAlign: TextAlign = TextAlign.Center
){
    Text(
        text = stringResource(textId),
        fontSize = fontSize,
        lineHeight = lineHeight,
        textAlign = textAlign,
        modifier = modifier
    )
}