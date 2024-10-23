package com.akashi.notesapp.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import compose.icons.FeatherIcons
import compose.icons.feathericons.Archive
import compose.icons.feathericons.ArrowLeft
@Composable
fun PreviewInner() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(40.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "Title",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Description",
            color = Color.White,
            fontSize = 20.sp
        )
    }
}

@Preview
@Composable
fun Inner() {
    Row{
        Icon(
        imageVector = FeatherIcons.Archive,
        contentDescription = "Search"

        )
        Icon(
            imageVector = FeatherIcons.ArrowLeft,
            contentDescription = "GoBack"
        )
    }
    PreviewInner()
}
