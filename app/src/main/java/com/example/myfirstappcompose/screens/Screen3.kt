package com.example.myfirstappcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myfirstappcompose.R
import com.example.myfirstappcompose.navigation.AppScreens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen3(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(stringResource(R.string.third_screen)) },
            navigationIcon = { Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                modifier = Modifier.clickable { navController.popBackStack() }
            )},
            actions = { Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = null,
                modifier = Modifier.clickable { navController.navigate(AppScreens.Screen4.route) }
            )}
        )})
    {
        BodyContent3(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            contentPadding = it
        )
    }
}

@Composable
private fun BodyContent3(modifier: Modifier = Modifier, contentPadding: PaddingValues){
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(contentPadding)
        )
        Text(
            text = stringResource(R.string.admin_task_text1),
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(
                top = 24. dp,
                bottom = 8. dp
            ))
        Text(
            text = stringResource(R.string.admin_task_text2),
            fontSize = 16. sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}