package com.example.kotlinkaixue01

class Student constructor(val name: String) {
    var id: String? = null
    var age = 0
    init {
        age = 18
    }

    constructor(name:String, id: String) : this(name) {
        this.id = id

    }

    fun show() {
        println("Stuent $name, $age, $id")
    }


}