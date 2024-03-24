package com.cumaliguzel.movies.fragment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.cumaliguzel.movies.data.entity.Movies
import com.cumaliguzel.movies.databinding.CardTasarimBinding
import com.cumaliguzel.movies.fragments.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class MoviesAdapter(var mContext: Context,var filmlerListesi:List<Movies>) : RecyclerView.Adapter<MoviesAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding)  :RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
      val binding=CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)
    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film=filmlerListesi.get(position)
        val t=holder.tasarim
        t.imageViewFilm.setImageResource(mContext.resources.getIdentifier(film.resim,"drawable",mContext.packageName))
        t.textViewFiyat.text="${film.fiyat} ₺"
        t.buttonSepet.setOnClickListener {
            Snackbar.make(it,"${film.ad} Sepete eklendi",Snackbar.LENGTH_LONG).show()
        }
        t.cardViewFilmler.setOnClickListener {
            val gecis=AnasayfaFragmentDirections.detayGecis(film=film)
            Navigation.findNavController(it).navigate(gecis)
        }


    }

}