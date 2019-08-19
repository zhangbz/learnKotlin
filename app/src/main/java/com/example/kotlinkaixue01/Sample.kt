package com.example.kotlinkaixue01

import android.view.View

class Sample {
    lateinit var v: View
    var name = "Mike"
    get() {
        return field + "nb"
    }
}