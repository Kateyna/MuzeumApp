package com.example.muzz123.API
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.mapview.MapView

@Composable
fun YandexMapComponent() {
    val context = LocalContext.current

    AndroidView(
        factory = { context ->
            MapView(context).apply {
                // Подготовка карты
                MapKitFactory.getInstance().onStart()
            }
        },
        modifier = Modifier.fillMaxSize()
    )
}