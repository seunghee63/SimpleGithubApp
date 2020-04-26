package com.stacker.simplegithubapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(ProfileActivity())

        BottomNavigationBar.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.menu_ProfileActivity->{
                    loadFragment(ProfileActivity())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_SearchActivity->{
                    loadFragment(SearchActivity())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_FollowerActivity->{
                    loadFragment(FollowerActivity())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_FollowingActivity->{
                    loadFragment(FollowingActivity())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transcation = supportFragmentManager.beginTransaction()
        transcation.replace(R.id.container, fragment)
        transcation.addToBackStack(null)
        transcation.commit()
    }
}



