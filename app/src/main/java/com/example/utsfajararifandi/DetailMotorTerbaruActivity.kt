package com.example.utsfajararifandi

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailMotorTerbaruActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_motor_terbaru)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val motorterbaru = intent.getParcelableExtra<Motorterbaru>(MainActivity.INTENT_PARCELABLE)

        val imgMotorterbaru = findViewById<ImageView>(R.id.img_item_photo)
        val nameMotorterbaru = findViewById<TextView>(R.id.tv_item_name)
        val descMotorterbaru = findViewById<TextView>(R.id.tv_item_description)

        imgMotorterbaru.setImageResource(motorterbaru?.imgMotorterbaru!!)
        nameMotorterbaru.text = motorterbaru.nameMotorterbaru
        descMotorterbaru.text = motorterbaru.descMotorterbaru
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}