package com.example.expandablerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val tableList=ArrayList<list>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        setRecyclerView()
    }

    private fun setRecyclerView() {
        val va=Adap(tableList)
        


    }

    private fun initData() {
        TODO("Not yet implemented")
    }
}