package fr.isen.nadaud.bamboozapp.Fragment

import androidx.fragment.app.Fragment
import fr.isen.nadaud.bamboozapp.R

open class BamboozFragment : Fragment() {

    fun goToFragment(fragment: BamboozFragment){
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        if (transaction != null) {
            transaction.replace(R.id.container, fragment)
            transaction.commit()
        }
    }
}