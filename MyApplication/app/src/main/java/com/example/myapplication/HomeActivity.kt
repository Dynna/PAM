package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.ItemAdapter
import com.example.myapplication.data.Datasource
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
   // private lateinit var posts: MutableList<Post>
  //  val items: ArrayList<Post> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

       val myDataset = Datasource().loadPosts()

       val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
       recyclerView.adapter = ItemAdapter(this, myDataset)

       recyclerView.setHasFixedSize(true)

       // ------------------------------------------------------

      // create layout file which represents one post - done
      // create data source - done
     // posts = mutableListOf()
      // create adapter
      // bind the adapter and layout manager to the rv


/*        addItems()

       // feedList.layoutManager = LinearLayoutManager(this)

        // for multiple columns
         feedList.layoutManager = GridLayoutManager(this, 2)

        feedList.adapter = ItemAdapter(items, this)*/

    }

/*    fun addItems() {
        items.add(Post("user1", "imageUrl"))
        items.add(Post("user2","imageUrl2"))
        items.add(Post("user3","imageUrl3"))
      //  items.add("https://images.unsplash.com/photo-1502912274126-08f31a73a5f0?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=729&q=80")
    }*/

}