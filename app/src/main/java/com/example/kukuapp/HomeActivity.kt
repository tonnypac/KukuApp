package com.example.kukuapp

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController

import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        val tradeFragment = TradeFragment()
        val learnFragment = LearnFragment()




        btnTrade.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, tradeFragment)
                addToBackStack(null)
                commit()
            }
        }

        btnLearn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, learnFragment)
                addToBackStack(null)
                commit()
            }
        }

    }
}

