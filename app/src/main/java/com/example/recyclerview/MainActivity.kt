package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.com.example.recyclerview.MyAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView : RecyclerView
    private lateinit var newArrayList: ArrayList<Example>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
                            R.drawable.rohit,
                            R.drawable.shikhar,
                            R.drawable.virat,
                            R.drawable.suresh,
                            R.drawable.surya,
                            R.drawable.dhoni,
                            R.drawable.hardik,
                            R.drawable.jadeja,
                            R.drawable.aswin,
                            R.drawable.kumar,
                            R.drawable.bumrah,


        )
        heading = arrayOf(
                            "ROHIT SHARMA",
                            "SHIKHAR DHAWN",
                            "VIRAT KOHLI",
                            "SURESH RAINA",
                            "SURYA KUMAR YADAV",
                            "MS DHONI",
                            "HARDIK PANDYA",
                            "RAVINDRA JADEJA",
                            "RAVICHANDRAN ASWIN",
                            "BHUBANESWAR KUMAR",
                            "JASPRIT BUMRAH"
        )

        newRecyclerView = findViewById(R.id.Recycler_view)
        newRecyclerView.layoutManager= LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList = arrayListOf<Example>()
        getUserData()

    }

    private fun getUserData() {

        for (i in imageId.indices)
        {
            val example = Example(imageId[i],heading[i])
            newArrayList.add(example)
        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }

}