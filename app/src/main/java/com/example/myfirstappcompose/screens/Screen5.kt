package com.example.myfirstappcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myfirstappcompose.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen5(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(stringResource(R.string.fifth_screen)) },
            navigationIcon = { Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                modifier = Modifier.clickable { navController.popBackStack() }
            ) }
        )
    }){
        BodyContent5(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize(),
            contentPadding = it
        )
    }
}

@Composable
private fun BodyContent5(modifier: Modifier = Modifier, contentPadding: PaddingValues) {
    val image = painterResource(id = R.drawable.perfil)
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(contentPadding)
        )
        Text(text = stringResource(R.string.full_name_card),
            fontSize = 24. sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(text = stringResource(R.string.title_card),
            fontSize = 15. sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(20. dp))
        ContactInfo(image = Icons.Default.Call, idInfo = R.string.telephone_number_card)
        ContactInfo(image = Icons.Default.Info, idInfo = R.string.socials_media_card)
        ContactInfo(image = Icons.Default.Email, idInfo = R.string.email_card)
    }
}

@Composable
private fun ContactInfo(image: ImageVector, idInfo: Int) {
    Row(
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 3. dp, bottom = 3. dp, start = 70. dp, end = 70. dp)
    ) {
        Icon(imageVector = image,
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(8. dp))
        Text(text = stringResource(id = idInfo),
            fontSize = 15. sp,
            textAlign = TextAlign.Justify
        )
    }
}