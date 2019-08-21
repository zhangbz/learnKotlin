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

        println(Singleton.id.toString() + " : " + Singleton.getName())

        test02()
    }

    fun printViewId(view: View?): Unit {
        println("view id = " + view?.id)
    }

    fun test02(){

        var array= arrayOfNulls<Int>(100000)
//        var intArr = intArrayOf()
        var intArr = IntArray(100000)
        var list = mutableListOf<Int>()

        var sum =0
        var average = 0

        var beginTime = System.currentTimeMillis()
        for (i in 1..100000) {
            array[i-1] = i
            sum+=i
        }

        average = sum/100000

        println("array 平均值：" + average + ", 操作耗时：" + (System.currentTimeMillis() - beginTime))

        sum = 0
        beginTime = System.currentTimeMillis()

        for (i in 1..100000) {
            intArr[i-1] = i
            sum+=i
        }

        average = sum/100000

        println("intArr 平均值：" + average + ", 操作耗时：" + (System.currentTimeMillis() - beginTime))


        sum = 0
        beginTime = System.currentTimeMillis()

        for (i in 1..100000) {
            list.add(i)
            sum+=i
        }

        average = sum/100000

        println("list 平均值：" + average + ", 操作耗时：" + (System.currentTimeMillis() - beginTime))


//        array 平均值：7050, 操作耗时：119
//        intArr 平均值：7050, 操作耗时：5   //效率惊人
//        list 平均值：7050, 操作耗时：292

    }
}
