package com.example.myfirstappcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.example.myfirstappcompose.R
import com.example.myfirstappcompose.navigation.AppScreens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen4(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(stringResource(R.string.fourth_screen)) },
            navigationIcon = { Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                modifier = Modifier.clickable { navController.popBackStack() }
            )},
            actions = { Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = null,
                modifier = Modifier.clickable { navController.navigate(AppScreens.Screen5.route) }
            )}
        )})
    {
        BodyContent4(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        )
    }
}

@Composable
private fun BodyContent4(modifier: Modifier = Modifier) {
    Column(modifier) {
        Row(Modifier.weight(1f)){
            CardText(
                title = stringResource(R.string.box_text_title1),
                detail = stringResource(R.string.box_text_detail1),
                color = 0xFFEADDFF,
                modifier = Modifier.weight(1f))
            CardText(
                title = stringResource(R.string.box_text_title2),
                detail = stringResource(R.string.box_text_detail2),
                color = 0xFFD0BCFF,
                modifier = Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)){
            CardText(
                title = stringResource(R.string.box_text_title3),
                detail = stringResource(R.string.box_text_detail3),
                color = 0xFFB69DF8,
                modifier = Modifier.weight(1f))
            CardText(
                title = stringResource(R.string.box_text_title4),
                detail = stringResource(R.string.box_text_detail4),
                color = 0xFFF6EDFF,
                modifier = Modifier.weight(1f))
        }
    }
}

@Composable
private fun CardText(title: String, detail: String, color: Long, modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(color)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center)
        Text(
            text = detail,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16. dp))
    }
}