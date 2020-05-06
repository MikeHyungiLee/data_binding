package com.hyungilee.databindingtutorial

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.hyungilee.databindingtutorial.databinding.RecyclerviewMovieBinding

class MoviesAdapter(
    private val movies: List<Movie>
) : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    override fun getItemCount(): Int = movies.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
//        MoviesViewHolder(
//            DataBindingUtil.inflate(
//                LayoutInflater.from(parent.context),
//                R.layout.recyclerview_movie,
//                parent,
//                false
//            )
//        )
        MoviesViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.recyclerview_movie,
                parent,
                false
            )
        )


    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        // movie(binding object) in layout file.
        holder.recyclerviewMovieBinding.movie = movies[position]
    }

    inner class MoviesViewHolder(
        val recyclerviewMovieBinding: RecyclerviewMovieBinding
    ): RecyclerView.ViewHolder(recyclerviewMovieBinding.root)

}