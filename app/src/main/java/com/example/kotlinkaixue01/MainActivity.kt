package com.example.kotlinkaixue01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    lateinit var view: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view = findViewById(R.id.tv)

        printViewId(view)
    }

    fun printViewId(view: View?): Unit {
        println("view id = " + view?.id)
    }
}
