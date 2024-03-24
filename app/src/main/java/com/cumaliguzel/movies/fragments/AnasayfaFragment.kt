package com.cumaliguzel.movies.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.cumaliguzel.movies.R
import com.cumaliguzel.movies.data.entity.Movies
import com.cumaliguzel.movies.databinding.FragmentAnasayfaBinding
import com.cumaliguzel.movies.fragment.adapter.MoviesAdapter

private lateinit var binding: FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentAnasayfaBinding.inflate(inflater,container,false)
        binding.toolbarAnasayfa.title="Movies"
        binding.moviesRv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        val filmlerListesi = ArrayList<Movies>()
        val f1 = Movies(1,"Django","django",24)
        val f2 = Movies(2,"Interstellar","interstellar",32)
        val f3 = Movies(3,"Inception","inception",16)
        val f4 = Movies(4,"The Hateful Eight","thehatefuleight",28)
        val f5 = Movies(5,"The Pianist","thepianist",18)
        val f6 = Movies(6,"Anadoluda","anadoluda",10)
        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)

        val filimleAdapter=MoviesAdapter(requireContext(),filmlerListesi)
        binding.moviesRv.adapter=filimleAdapter


        return binding.root






    }

}