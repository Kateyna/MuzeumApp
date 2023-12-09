package com.example.muzz123.Room

import kotlinx.coroutines.flow.Flow

class FavRepo(private val dao: FavDao) {
    val allTasks: Flow<List<FavoriteEntity>> = dao.getAllFavorite()

    suspend fun insert(fav: FavoriteEntity){
        dao.insertFavorite(fav)
    }




}
