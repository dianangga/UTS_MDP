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
            Product(
                "AEROSTREET OFFICIAL SEPATU AERO STREET SEPATU PRIA 36-45 HOOPS LOW HITAM PUTIH",
                "Rp245.000",
                "TIDAK AKAN JEBOL setelah dicuci atau kehujanan karena menggunakan tekhnologi baru Shoes Injection Mould bahan sole dicairkan dengan tekanan tinggi menyatu sempurna dengan bahan kain dari sepatu tanpa menggunakan proses lem. \nBahan : Kanvas ",
                R.drawable.shoe1
            ), Product(
                "Aerostreet 36-45 Osaka Putih Abu Merah - Sepatu Sneakers Casual Pria Wanita Aero Street",
                "Rp179.000",
                "TIDAK AKAN JEBOL setelah dicuci atau kehujanan.\n" + "karena menggunakan tekhnologi baru Shoes Injection Mould.\n" + "bahan sole dicairkan dengan tekanan tinggi menyatu sempurna dengan.\n" + "bahan kain dari sepatu tanpa menggunakan proses lem.",
                R.drawable.shoe2
            ), Product(
                "Aerostreet 37-44 Hoops Low Putih Putih Hijau Tua - Sepatu Sneakers Casual Pria Wanita Aero Street", "Rp156.000", "TIDAK AKAN JEBOL setelah dicuci atau kehujanan karena menggunakan technologi baru Shoes Injection Mould bahan sole dicairkan dengan tekanan tinggi menyatu sempurna dengan bahan kain dari sepatu tanpa menggunakan proses lem.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Bahan : Kanvas - Mesh - Kulit sintetis", R.drawable.shoe3
            ),  Product(
                "AEROSTREET OFFICIAL SEPATU AERO STREET SEPATU PRIA 36-45 HOOPS LOW HITAM PUTIH",
                "Rp245.000",
                "TIDAK AKAN JEBOL setelah dicuci atau kehujanan karena menggunakan tekhnologi baru Shoes Injection Mould bahan sole dicairkan dengan tekanan tinggi menyatu sempurna dengan bahan kain dari sepatu tanpa menggunakan proses lem. \nBahan : Kanvas ",
                R.drawable.shoe1
            ), Product(
                "Aerostreet 36-45 Osaka Putih Abu Merah - Sepatu Sneakers Casual Pria Wanita Aero Street",
                "Rp179.000",
                "TIDAK AKAN JEBOL setelah dicuci atau kehujanan.\n" + "karena menggunakan tekhnologi baru Shoes Injection Mould.\n" + "bahan sole dicairkan dengan tekanan tinggi menyatu sempurna dengan.\n" + "bahan kain dari sepatu tanpa menggunakan proses lem.",
                R.drawable.shoe2
            ), Product(
                "Aerostreet 37-44 Hoops Low Putih Putih Hijau Tua - Sepatu Sneakers Casual Pria Wanita Aero Street", "Rp156.000", "TIDAK AKAN JEBOL setelah dicuci atau kehujanan karena menggunakan technologi baru Shoes Injection Mould bahan sole dicairkan dengan tekanan tinggi menyatu sempurna dengan bahan kain dari sepatu tanpa menggunakan proses lem.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Bahan : Kanvas - Mesh - Kulit sintetis", R.drawable.shoe3
            ),  Product(
                "AEROSTREET OFFICIAL SEPATU AERO STREET SEPATU PRIA 36-45 HOOPS LOW HITAM PUTIH",
                "Rp245.000",
                "TIDAK AKAN JEBOL setelah dicuci atau kehujanan karena menggunakan tekhnologi baru Shoes Injection Mould bahan sole dicairkan dengan tekanan tinggi menyatu sempurna dengan bahan kain dari sepatu tanpa menggunakan proses lem. \nBahan : Kanvas ",
                R.drawable.shoe1
            ), Product(
                "Aerostreet 36-45 Osaka Putih Abu Merah - Sepatu Sneakers Casual Pria Wanita Aero Street",
                "Rp179.000",
                "TIDAK AKAN JEBOL setelah dicuci atau kehujanan.\n" + "karena menggunakan tekhnologi baru Shoes Injection Mould.\n" + "bahan sole dicairkan dengan tekanan tinggi menyatu sempurna dengan.\n" + "bahan kain dari sepatu tanpa menggunakan proses lem.",
                R.drawable.shoe2
            ), Product(
                "Aerostreet 37-44 Hoops Low Putih Putih Hijau Tua - Sepatu Sneakers Casual Pria Wanita Aero Street", "Rp156.000", "TIDAK AKAN JEBOL setelah dicuci atau kehujanan karena menggunakan technologi baru Shoes Injection Mould bahan sole dicairkan dengan tekanan tinggi menyatu sempurna dengan bahan kain dari sepatu tanpa menggunakan proses lem.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Bahan : Kanvas - Mesh - Kulit sintetis", R.drawable.shoe3
            ),  Product(
                "AEROSTREET OFFICIAL SEPATU AERO STREET SEPATU PRIA 36-45 HOOPS LOW HITAM PUTIH",
                "Rp245.000",
                "TIDAK AKAN JEBOL setelah dicuci atau kehujanan karena menggunakan tekhnologi baru Shoes Injection Mould bahan sole dicairkan dengan tekanan tinggi menyatu sempurna dengan bahan kain dari sepatu tanpa menggunakan proses lem. \nBahan : Kanvas ",
                R.drawable.shoe1
            ), Product(
                "Aerostreet 36-45 Osaka Putih Abu Merah - Sepatu Sneakers Casual Pria Wanita Aero Street",
                "Rp179.000",
                "TIDAK AKAN JEBOL setelah dicuci atau kehujanan.\n" + "karena menggunakan tekhnologi baru Shoes Injection Mould.\n" + "bahan sole dicairkan dengan tekanan tinggi menyatu sempurna dengan.\n" + "bahan kain dari sepatu tanpa menggunakan proses lem.",
                R.drawable.shoe2
            ), Product(
                "Aerostreet 37-44 Hoops Low Putih Putih Hijau Tua - Sepatu Sneakers Casual Pria Wanita Aero Street", "Rp156.000", "TIDAK AKAN JEBOL setelah dicuci atau kehujanan karena menggunakan technologi baru Shoes Injection Mould bahan sole dicairkan dengan tekanan tinggi menyatu sempurna dengan bahan kain dari sepatu tanpa menggunakan proses lem.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Bahan : Kanvas - Mesh - Kulit sintetis", R.drawable.shoe3
            )
        )

        recyclerView.adapter = ProductAdapter(this, productList)
    }
}