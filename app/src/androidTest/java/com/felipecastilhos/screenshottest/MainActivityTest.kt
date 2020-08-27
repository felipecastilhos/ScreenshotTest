package com.felipecastilhos.screenshottest

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.facebook.testing.screenshot.Screenshot.snapActivity
import org.junit.Rule
import org.junit.Test


class MainActivityTest {
    @Rule @JvmField
    var activityScenarioRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun snapShotTest() {


        activityScenarioRule.scenario.onActivity { activity ->
            snapActivity(activity).record()
        }
    }
}