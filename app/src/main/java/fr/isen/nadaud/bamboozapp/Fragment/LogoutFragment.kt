package fr.isen.nadaud.bamboozapp.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fr.isen.nadaud.bamboozapp.databinding.LoginLayoutBinding
import fr.isen.nadaud.bamboozapp.databinding.LogoutLayoutBinding

class SignUpFragment : BamboozFragment() {
    lateinit var binding: LogoutLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = LogoutLayoutBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnClick()
    }

    fun setOnClick() {

    }
}