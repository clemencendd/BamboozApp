
package fr.isen.nadaud.bamboozapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import fr.isen.nadaud.bamboozapp.Fragment.WelcomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Ouverture du premier fragment

        supportFragmentManager.beginTransaction().add(R.id.nav_fragment, WelcomeFragment()).commit()

    }

}