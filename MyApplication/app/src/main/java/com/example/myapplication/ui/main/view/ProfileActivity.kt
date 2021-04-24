package com.example.myapplication.ui.main.view

import android.os.Bundle
import android.transition.TransitionManager
import android.view.WindowManager
import android.widget.ImageView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.example.myapplication.R

class ProfileActivity : AppCompatActivity() {

    private var isExpanded = false
    private val layout1 = ConstraintSet()
    private val layout2 = ConstraintSet()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val constraintLayout : ConstraintLayout = findViewById(R.id.constraintLayout)
        val coverImageView : ImageView = findViewById(R.id.coverImageView)

        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        layout1.clone(constraintLayout)
       /* layout2.clone(this@ProfileActivity, R.layout.activity_profile_expanded)

        coverImageView.setOnClickListener {
            when(isExpanded){
                true -> {
                    TransitionManager.beginDelayedTransition(constraintLayout)
                    layout1.applyTo(constraintLayout)
                }
                false -> {
                    TransitionManager.beginDelayedTransition(constraintLayout)
                    layout2.applyTo(constraintLayout)
                }
            }
            isExpanded = !isExpanded
        }*/
    //    setSupportActionBar(findViewById(R.id.toolbar))

/*        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }*/
    }
}