package com.example.muzz123

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.muzz123.API.YandexMapComponent
import com.example.muzz123.bottomnav.MainScreeen
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.mapview.MapView

class MainActivity : ComponentActivity() {

    private lateinit var mapView: MapView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Установка API ключа и инициализация MapKit
        MapKitFactory.setApiKey("584573e6-a975-4863-987d-d3b189a270c6")
        MapKitFactory.initialize(this)
        mapView = MapView(this)
        // Установка содержимого активности с помощью Compose
        setContent {
            MainScreeen()
        }
    }

    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onStop() {
        mapView.onStop()
        super.onStop()
    }
}



