package fr.isen.nadaud.bamboozapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fr.isen.nadaud.bamboozapp.R
import fr.isen.nadaud.bamboozapp.databinding.FragmentPublishBinding
import fr.isen.nadaud.bamboozapp.databinding.FragmentSearchBinding

class SearchFragment : BamboozFragment() {

    lateinit var binding: FragmentSearchBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(layoutInflater, container, false)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnClick()
    }

    fun setOnClick() {

    }
}