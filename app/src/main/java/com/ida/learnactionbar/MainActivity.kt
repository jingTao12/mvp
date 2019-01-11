package com.ida.learnactionbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.view.Window
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        initView()


    }

    override fun onResume() {
        super.onResume()
    }

    fun initView() {
        setSupportActionBar(toolbar)
        findViewById<TabLayout>(R.id.tabs)


    }
}
