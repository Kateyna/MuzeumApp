package com.example.muzz123.ui.theme

import androidx.compose.ui.graphics.painter.Painter

data class Muzeums(
    val id: Int,
    val name: String,
    val rating: Int,
    val image: Painter // Добавляем поле для изображения
)