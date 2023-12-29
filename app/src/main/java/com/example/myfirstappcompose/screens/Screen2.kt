package com.example.myfirstappcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myfirstappcompose.R
import com.example.myfirstappcompose.navigation.AppScreens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen2(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(stringResource(R.string.second_screen)) },
            navigationIcon = { Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                modifier = Modifier.clickable { navController.popBackStack() }
            )},
            actions = { Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = null,
                modifier = Modifier.clickable { navController.navigate(AppScreens.Screen3.route) }
            )}
        )}
    ) {
        BodyContent2(
            modifier = Modifier.padding(it)
        )
    }
}

@Composable
private fun BodyContent2(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(id = R.string.title_article),
            fontSize = 24. sp,
            modifier = Modifier
                .padding(16. dp)
        )
        Text(
            text = stringResource(id = R.string.text1_article),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(
                    start = 16. dp,
                    end = 16. dp
                )
        )
        Text(
            text = stringResource(id = R.string.text2_article),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16. dp)
        )
    }
}