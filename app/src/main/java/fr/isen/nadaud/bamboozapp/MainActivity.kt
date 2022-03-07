
package fr.isen.nadaud.bamboozapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.isen.nadaud.bamboozapp.Fragment.WelcomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ouverture du premier fragment
        supportFragmentManager.beginTransaction().add(R.id.container, WelcomeFragment()).commit()
    }
}