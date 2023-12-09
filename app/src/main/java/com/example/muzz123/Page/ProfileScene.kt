package com.example.muzz123.Page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.muzz123.R
import com.example.muzz123.ui.theme.NormalTextComponent

@Composable
fun ProfileScene() {

    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)



    ) {
        NormalTextComponent(value = stringResource(id = R.string.hello2))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                shape = RoundedCornerShape(50),
                onClick = {
                    // Здесь можно добавить логику для выхода из аккаунта
                },

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(22.dp)
                    .width(200.dp)

            ) {
                Text(text = "Выйти из аккаунта")
            }
            Button(
                onClick = {
                    // Здесь можно добавить логику для выхода из аккаунта
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(22.dp)
                    .width(200.dp)
            ) {
                Text(text = "Избранное")
            }


        }
    }
}
@Preview
@Composable
fun HasDefaultViewModelProviderFactory(){
    ProfileScene()
}