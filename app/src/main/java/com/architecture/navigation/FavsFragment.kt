package com.architecture.navigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation

class FavsFragment : Fragment(),View.OnClickListener {

    lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_favs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.launchCBtn).setOnClickListener(this)
        navController = Navigation.findNavController(view)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.launchCBtn -> navController!!.navigate(R.id.action_fragmentA_to_fragmentC)
        }
    }
}
