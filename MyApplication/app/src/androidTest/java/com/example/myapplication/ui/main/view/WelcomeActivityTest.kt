package com.example.myapplication.ui.main.view

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myapplication.R
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class WelcomeActivityTest() {

    @get:Rule
    val activityRule = ActivityScenarioRule(WelcomeActivity::class.java)

    @Test
    fun pressBackButton() {
        onView(withId(R.id.button2)).perform(click());
    }

    @Test
    fun pressAgreeButton() {
        onView(withId(R.id.button3)).perform(click());
    }
}