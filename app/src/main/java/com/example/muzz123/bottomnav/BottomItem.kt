package com.example.muzz123.bottomnav

import com.example.muzz123.R

sealed class BottomItem(val title: String, val  iconId: Int, val route: String){
    object Screen1: BottomItem("Музеи рядом", R.drawable.map, "screen_1" )
    object Screen2: BottomItem("Главная", R.drawable.muzz, "screen_2" )
    object Screen3: BottomItem("Мой профиль", R.drawable.per, "screen_3" )
}
