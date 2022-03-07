package fr.isen.nadaud.bamboozapp.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fr.isen.nadaud.bamboozapp.databinding.FragmentUserResearchBinding
import fr.isen.nadaud.bamboozapp.databinding.WelcomeScreenViewBinding

class WelcomeFragment : BamboozFragment() {

    lateinit var binding: WelcomeScreenViewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = WelcomeScreenViewBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    fun setOnClick(){
        //Make actions
        binding.btnLogin.setOnClickListener(View.OnClickListener { view ->

        })
        binding.btnLogout.setOnClickListener(View.OnClickListener { view ->

        })
    }
}