package com.example.muzz123.Room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ViewModelFav(application: Application) : AndroidViewModel(application) {
    private val repository: FavRepo
    val allTasks: kotlinx.coroutines.flow.Flow<List<FavoriteEntity>>

    init {
        val taskDao = AppDatabase.getDatabase(application).dao()
        repository = FavRepo(taskDao)
        allTasks = repository.allTasks
    }

    fun insert(fav: FavoriteEntity) = viewModelScope.launch {
        repository.insert(fav)
    }


}
