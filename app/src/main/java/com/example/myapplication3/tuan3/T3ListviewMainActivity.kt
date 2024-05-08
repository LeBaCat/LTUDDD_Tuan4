package com.example.myapplication3.tuan3

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication3.R

class T3ListviewMainActivity : AppCompatActivity() {
    var adapter: T3Adapter? = null
    var ls = ArrayList<T3Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_t3_listview_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var lv=findViewById<ListView>(R.id.t3Listview)
        //Them du lieu vao list view
        ls.add(T3Contact("Nguyen Van A","20",R.drawable.android))
        ls.add(T3Contact("Nguyen Van B","19",R.drawable.apple))
        ls.add(T3Contact("Nguyen Van C","21",R.drawable.blogger))
        ls.add(T3Contact("Nguyen Van D","22",R.drawable.border))
        ls.add(T3Contact("Nguyen Van E","23",R.drawable.dell))
        ls.add(T3Contact("Nguyen Van F","20",R.drawable.chrome))
        ls.add(T3Contact("Nguyen Van G","20",R.drawable.hp))

        adapter = T3Adapter(ls,this)
        //gan du lieu len Listview
        lv!!.adapter=adapter

    }
}