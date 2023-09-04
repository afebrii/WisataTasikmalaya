package com.afebrii.wisatatasikmalaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_activity)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvHeading: TextView = findViewById(R.id.heading)
        val ivImage: ImageView = findViewById(R.id.image)
        val tvdesc: TextView = findViewById(R.id.detail)

        val tHead = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tDesc = intent.getStringExtra(EXTRA_DESCRIPTION)

        tvHeading.text = tHead
        ivImage.setImageResource(tImg)
        tvdesc.text = tDesc

    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DESCRIPTION = "extra_description"
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}