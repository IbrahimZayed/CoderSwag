package com.example.smith.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import com.example.smith.coderswag.Adapters.CategoryAdapter
import com.example.smith.coderswag.Adapters.CategoryRecycleAdapter
import com.example.smith.coderswag.Model.Category
import com.example.smith.coderswag.R
import com.example.smith.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this,DataService.categories)
        categoryListView.adapter = adapter

        val layoutManger =  LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManger
        categoryListView.setHasFixedSize(true)


    }


}
