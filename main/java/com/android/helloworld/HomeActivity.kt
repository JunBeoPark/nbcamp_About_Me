package com.android.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val hm_id = findViewById<TextView>(R.id.hm_id)
        if(intent.hasExtra("id")) {
            hm_id.text = "아이디 : "+ intent.getStringExtra("id")
        }

        val btn_close = findViewById<Button>(R.id.close)
        btn_close.setOnClickListener{
            finish()
        }

    }
}