package com.orange.e_learningcourses

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class CoursesHomeTwo : AppCompatActivity() {
    lateinit var videoView: VideoView
    lateinit var imageView: ImageView
    lateinit var bottom_navigation: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.courses_home)
        bottom_navigation=findViewById(R.id.Bottom_Navigation)
        bottom_navigation.setOnItemSelectedListener (NavigationBarView.OnItemSelectedListener {
            if (it.itemId==R.id.Home){
            }
            else if(it.itemId==R.id.Stare){
                val intent = Intent(this@CoursesHomeTwo,Category::class.java)
                startActivity(intent)
            }
            else if(it.itemId==R.id.Vido){
            }
            else if(it.itemId==R.id.Account){
            }
            return@OnItemSelectedListener true
        })
        bottom_navigation.selectedItemId=R.id.Home
    }
//    private fun pushfragment(fragment: Fragment) {
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.main_fragment_layout, fragment).commit()
//    }
}