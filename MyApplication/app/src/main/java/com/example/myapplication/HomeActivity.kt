package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.ItemAdapter
import com.example.myapplication.data.Datasource
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

       val myDataset = Datasource().loadPosts()

       val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
       recyclerView.adapter = ItemAdapter(this, myDataset)

       recyclerView.setHasFixedSize(true)
    }
}
