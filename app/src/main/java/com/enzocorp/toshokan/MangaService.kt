package com.enzocorp.toshokan

import retrofit2.Call
import retrofit2.http.GET

interface MangaService {
    @GET("manga_list/")
    fun getMangas(): Call<List<Manga>>
}