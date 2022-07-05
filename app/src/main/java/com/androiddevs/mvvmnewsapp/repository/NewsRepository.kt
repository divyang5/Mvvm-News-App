package com.androiddevs.mvvmnewsapp.repository

import androidx.room.Query
import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.ui.db.ArticleDatabase

class NewsRepository(
    val db:ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode : String , pageNumber : Int)=
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)

    suspend fun searchNews(searchQuery: String , pageNumber : Int)=
        RetrofitInstance.api.searchForNews(searchQuery,pageNumber)
}