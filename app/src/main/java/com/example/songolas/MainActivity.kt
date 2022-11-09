package com.example.songolas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val angka = findViewById<EditText>(R.id.inputAngka)
        val cekBtn = findViewById<Button>(R.id.cekBtn)

        cekBtn.setOnClickListener {
            cekA(angka.text.toString().toInt())
        }
    }

    fun cekA(angka: Int) {
        if (angka >= 90) {
            Toast.makeText(this,"Nilai A", Toast.LENGTH_SHORT).show()
        } else {
            if (angka >= 75) {
                Toast.makeText(this, "Nilai B", Toast.LENGTH_SHORT).show()
            } else {
                if (angka >= 65) {
                    Toast.makeText(this, "Nilai C", Toast.LENGTH_SHORT).show()
                } else {
                    if (angka >= 50) {
                        Toast.makeText(this, "Nilai D", Toast.LENGTH_SHORT).show()
                    } else {
                        if (angka >= 0) {
                            Toast.makeText(this, "Nilai E", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }
}