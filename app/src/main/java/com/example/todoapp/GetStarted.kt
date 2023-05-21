package com.example.todoapp

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView




class GetStarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        val btn1 = findViewById<ImageView>(R.id.getstartedbtn)
        btn1.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            // Start the second activity
            startActivity(intent)



        }
        val boton = findViewById<ImageView>(R.id.imageView2)

        boton.setOnClickListener {
            val dialogView = LayoutInflater.from(this).inflate(R.layout.popup_layout, null)

            val abtDialog = Dialog(this)
            abtDialog.setContentView(dialogView)

            // popup close

            abtDialog.setCancelable(true)
            abtDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            abtDialog.show()

            dialogView.findViewById<ImageView>(R.id.sder)?.setOnClickListener {
                abtDialog.dismiss()
            }
        }}
}