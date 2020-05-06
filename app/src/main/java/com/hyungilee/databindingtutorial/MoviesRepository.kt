package com.hyungilee.databindingtutorial

class MoviesRepository(
    private val api: MoviesApi
) : SafeApiRequest() {
    suspend fun getMovies() = apiRequest { api.getMovies()}
}