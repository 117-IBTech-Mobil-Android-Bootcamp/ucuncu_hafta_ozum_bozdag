package com.info.bootcampweekthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navController=findNavController(R.id.nav_host_fragment_container)
        NavigationUI.setupWithNavController(botNavigation,navController)


    }

    fun hideNavigation(){
        botNavigation.postDelayed(
                {
                    botNavigation.visibility=View.GONE
                }, 500
        )
    }

    fun showNavigation(){
        botNavigation.postDelayed(
                {
                    botNavigation.visibility=View.VISIBLE
                }, 500
        )
    }

}