package fr.isen.nadaud.bamboozapp.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fr.isen.nadaud.bamboozapp.databinding.LoginLayoutBinding

class LoginFragment : BamboozFragment() {
    lateinit var binding: LoginLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = LoginLayoutBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnClick()
    }
    fun setOnClick(){
        //Make actions
        binding.btnLogin.setOnClickListener(View.OnClickListener { view ->
            //Login function
            login()
        })
        binding.btnLogout.setOnClickListener(View.OnClickListener { view ->
            this.goToFragment(SignUpFragment())
        })
    }

    fun login(){
        //Get all values from layout

        val mailValue = binding.etMail.text
        val passwordValue = binding.etPassword.text
        this.goToFragment(ActuFragment())



    }
}