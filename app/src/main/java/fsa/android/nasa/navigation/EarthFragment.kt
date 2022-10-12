package fsa.android.nasa.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fsa.android.nasa.R

class EarthFragment: Fragment(),Names {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_earth,container,false)
    }

    override fun getName(): String {
        return "EARTH"
    }
}