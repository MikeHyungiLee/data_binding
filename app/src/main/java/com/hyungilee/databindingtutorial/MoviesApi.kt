package com.hyungilee.databindingtutorial

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MoviesApi {

    @GET("movies")
    suspend fun getMovies() : Response<ArrayList<Movie>>

    companion object{
        operator fun invoke(): MoviesApi{
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://10.0.2.2:3333/")
                .build()
                .create(MoviesApi::class.java)
        }
    }
}