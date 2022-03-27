package fr.isen.nadaud.bamboozapp.Fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import fr.isen.nadaud.bamboozapp.R

open class BamboozFragment : Fragment() {
    var bottomNavigationView : BottomNavigationView? = null

    fun goToFragment(fragment: BamboozFragment){
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        if (transaction != null) {
            transaction.add(R.id.nav_fragment, fragment)
            transaction.commit()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //fonction du fragment

        setupNav()
    }

    private fun setupNav() {
        bottomNavigationView = activity?.findViewById(R.id.bottom_navigatin_view)
        val navController = activity?.findNavController(R.id.nav_fragment)
        bottomNavigationView!!.setupWithNavController(navController!!)

        bottomNavigationView!!.setOnNavigationItemSelectedListener { it ->
            when(it.itemId){
                R.id.searchFragment->goToFragment(SearchFragment())
                R.id.PublishFragment->goToFragment(PublishFragment())
                R.id.actuFragment->goToFragment(ActuFragment())
                R.id.mapFragment->goToFragment(MapFragment())
                R.id.profileFragment->goToFragment(ProfileFragment())
            }
            true
        }
    }


    fun showBottomNav() {
        bottomNavigationView!!.visibility = View.VISIBLE

    }

    fun hideBottomNav() {
        bottomNavigationView!!.visibility = View.GONE

    }
}