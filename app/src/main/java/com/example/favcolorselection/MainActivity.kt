package com.example.favcolorselection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.favcolorselection.R


class MainActivity : AppCompatActivity() {

    val colors= arrayOf("Red","Blue","Green","Yellow","Black")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.btConfirm)
        button.setOnClickListener{
            Toast.makeText(this,"You Have Confirmed",Toast.LENGTH_SHORT).show()
        }
        val arrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, colors)
        val spinner: Spinner = findViewById(R.id.spinner)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(
                    this@MainActivity,
                    "You Selected " + colors[p2],
                    Toast.LENGTH_LONG
                ).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }


    }
}