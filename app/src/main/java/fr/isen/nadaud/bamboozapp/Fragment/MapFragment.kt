package fr.isen.nadaud.bamboozapp.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
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
            addMapkers()
            mMap.setOnMapClickListener { latLng -> // When clicked on map

            }
        }

        return rootView
    }

    fun addMapkers(){
        val markerPosition = LatLng(43.117030, 5.932195)
        // Initialize marker options
        val markerOptions = MarkerOptions()
        // Set position of marker
        markerOptions.position(markerPosition)
        // Set title of marker
        markerOptions.title(markerPosition.latitude.toString() + " : " + markerPosition.longitude)
        // Remove all marker
        mMap.clear()
        // Animating to zoom the marker
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(markerPosition, 10f))
        // Add marker on map
        mMap.addMarker(markerOptions)

    }

}