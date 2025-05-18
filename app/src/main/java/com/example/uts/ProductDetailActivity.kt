package com.example.uts

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val name = intent.getStringExtra("name")
        val price = intent.getStringExtra("price")
        val desc = intent.getStringExtra("desc")
        val image = intent.getIntExtra("image", R.drawable.ic_launcher_foreground)

        findViewById<TextView>(R.id.detailName).text = name
        findViewById<TextView>(R.id.detailPrice).text = price
        findViewById<TextView>(R.id.detailDesc).text = desc
        findViewById<ImageView>(R.id.detailImage).setImageResource(image)
    }
}
