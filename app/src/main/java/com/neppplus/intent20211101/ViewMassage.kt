package com.neppplus.intent20211101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_massage.*

class ViewMassage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_massage)

        val recoiveMessage = intent.getStringExtra("message")

        txtMessage.text = recoiveMessage
    }
}