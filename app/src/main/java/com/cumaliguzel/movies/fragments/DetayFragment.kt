package com.cumaliguzel.movies.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.cumaliguzel.movies.R
import com.cumaliguzel.movies.databinding.FragmentDetayBinding

private lateinit var binding: FragmentDetayBinding


class DetayFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       binding= FragmentDetayBinding.inflate(inflater,container,false)
        val bundle : DetayFragmentArgs by navArgs()
        val film=bundle.film
        binding.toolbarDetay.title=film.ad
        binding.imageViewMovies.setImageResource(resources.getIdentifier(film.resim,"drawable",requireContext().packageName))
        binding.textViewPrice.text="${film.fiyat} ₺ "


        return binding.root
    }

}