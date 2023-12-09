package com.example.muzz123.Page

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.muzz123.R
import com.example.muzz123.ui.theme.Muzeums

@Composable
fun MainList() {
    val muzeumList = listOf(
        Muzeums(
            id = 1,
            name = "Музей1",
            rating = 0,
            image = painterResource(id = R.drawable.afs)
        ),
        Muzeums(
            id = 2,
            name = "Музей2",
            rating = 5,
            image = painterResource(id = R.drawable.p1)
        ),
        Muzeums(
            id = 3,
            name = "Музей3",
            rating = 5,
            image = painterResource(id = R.drawable.p1)
        ),

        )



    LazyColumn {
        item {
            Text(
                text = "Музеи Москвы",
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 40.dp),
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal
                ), color = colorResource(id = R.color.colorText),
                textAlign = TextAlign.Center
            )
        }

        items(muzeumList) { museum ->
            MainScene(muzeums = museum)
        }
    }
}
