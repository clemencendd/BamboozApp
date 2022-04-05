package fr.isen.nadaud.bamboozapp.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import fr.isen.nadaud.bamboozapp.R
import fr.isen.nadaud.bamboozapp.databinding.FragmentMapBinding


class MapFragment : BamboozFragment(){
    lateinit var binding: FragmentMapBinding
    private lateinit var mMap: GoogleMap

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_map, container, false)

        // Initialize map fragment
        val supportMapFragment =
            childFragmentManager.findFragmentById(R.id.google_map) as SupportMapFragment?
        supportMapFragment!!.getMapAsync { googleMap ->
            // When map is loaded
            mMap = googleMap
            addMapkers(mMap)
            mMap.setOnMapClickListener { latLng -> // When clicked on map

            }
        }
        return rootView
    }

    private fun addMapkers(map: GoogleMap){

        val database = Firebase.database("https://bamboozapp-default-rtdb.firebaseio.com/").getReference("challenge")

        database.get().addOnSuccessListener {

            for (ds in it.children) {

                if (it.exists()) {

                    val latitude = ds.child("latitude").getValue(Double::class.java) as Double
                    val longitude = ds.child("longitude").getValue(Double::class.java) as Double
                    val description = ds.child("description").getValue(String::class.java)

                    val position = LatLng(latitude, longitude)
                    val zoomLevel = 5f // f : float number

                    map.addMarker(MarkerOptions().position(position).title(description))
                    map.moveCamera(CameraUpdateFactory.newLatLngZoom(position, zoomLevel))

                }
            }


        }
    }
}