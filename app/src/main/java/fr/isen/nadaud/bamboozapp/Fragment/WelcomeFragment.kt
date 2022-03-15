package fr.isen.nadaud.bamboozapp.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fr.isen.nadaud.bamboozapp.databinding.FragmentUserResearchBinding
import fr.isen.nadaud.bamboozapp.databinding.WelcomeLayoutBinding

// Notion héritage avec BamboozFragment
class WelcomeFragment : BamboozFragment() {

    lateinit var binding: WelcomeLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = WelcomeLayoutBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //fonction du fragment
        hideBottomNav()
        setOnClick()

    }

    fun setOnClick(){
        //Make actions
        binding.btnLogin.setOnClickListener(View.OnClickListener { view ->
            this.goToFragment(LoginFragment())
        })
        binding.btnSignup.setOnClickListener(View.OnClickListener { view ->
            this.goToFragment(SignUpFragment())
        })
    }
}