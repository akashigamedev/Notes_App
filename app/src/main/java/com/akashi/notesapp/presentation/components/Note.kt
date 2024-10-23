package com.akashi.notesapp.presentation.components

import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akashi.notesapp.data.NoteItem

@Composable
fun Note(
    noteItem: NoteItem
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)) {

        Box(
            modifier = Modifier
                .height(180.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(Color.DarkGray)
                .padding(16.dp)
        ) {
            Text(noteItem.desc, color = Color.White, fontSize = 16.sp)

        }
        Text(
            noteItem.title,
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(noteItem.time, color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text(noteItem.date, color = Color.White, fontSize = 16.sp)
    }
}
