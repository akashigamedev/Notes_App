package com.akashi.notesapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Note(   ){
    Column( horizontalAlignment = Alignment.CenterHorizontally ) {

        Box(modifier = Modifier
            .size(120.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.DarkGray)
            .padding(16.dp)) {
            Text("This is the description", color = Color.White, fontSize = 16.sp )

        }
        Text("Title", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text("Duration", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text("Date", color = Color.White, fontSize = 12.sp)
    }
}
