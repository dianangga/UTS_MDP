package com.example.uts

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts.adapter.ProductAdapter
import com.example.uts.model.Product

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val productList = listOf(
            Product("Aerostreet Alpha", "Rp120.000", "Sepatu kasual berkualitas", R.drawable.shoe1),
            Product("Aerostreet Runner", "Rp150.000", "Sepatu lari ringan dan nyaman", R.drawable.shoe1),
            Product("Aerostreet XTR", "Rp175.000", "Sepatu olahraga kekinian", R.drawable.shoe1
            )
        )

        recyclerView.adapter = ProductAdapter(this,productList)
    }
}