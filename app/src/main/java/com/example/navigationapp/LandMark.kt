package com.example.googlemaps_ice_task

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationapp.R
import com.google.android.gms.maps.model.LatLng

class LandMark : AppCompatActivity() {
    private lateinit var selectedLandmark: LatLng
    private lateinit var userLocation: LatLng

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_land_makrj)

        // Get the selected landmark and user location from intent
        selectedLandmark = intent.getParcelableExtra("selectedLandmark") ?: LatLng(0.0, 0.0)
        userLocation = intent.getParcelableExtra("userLocation") ?: LatLng(0.0, 0.0)

        calculateRoute()
        displayRouteOnMap()
        showEstimatedTimeAndDistance()
    }

    private fun calculateRoute() {
        // TODO: Use a routing service or algorithm to calculate the best route
    }

    private fun displayRouteOnMap() {
        // TODO: Display the calculated route on the embedded map
    }

    private fun showEstimatedTimeAndDistance() {
        // TODO: Calculate and display estimated time and distance to the landmark
    }
}
