package com.example.mobile_programming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var input_panjang : EditText
    private lateinit var input_lebar : EditText
    private lateinit var input_tinggi : EditText
    private lateinit var btn : Button
    private lateinit var teks_hasil : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input_lebar= findViewById(R.id.edt_width)
        input_panjang= findViewById(R.id.edt_length)
        input_tinggi= findViewById(R.id.edt_height)
        btn= findViewById(R.id.btn_result)
        teks_hasil= findViewById(R.id.result)

        btn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id==R.id.btn_result){
            val panjang = input_panjang.text.toString().trim()
            val lebar = input_lebar.text.toString().trim()
            val tinggi = input_tinggi.text.toString().trim()
            val volume = tinggi.toDouble() * panjang.toDouble() * lebar.toDouble()
            teks_hasil.text = volume.toString()

        }
    }
}