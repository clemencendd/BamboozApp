package fr.isen.nadaud.bamboozapp.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import fr.isen.nadaud.bamboozapp.R

class MapActivity : AppCompatActivity(), OnMapReadyCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
    }

    override fun onMapReady(p0: GoogleMap) {
        TODO("Not yet implemented")
    }
}