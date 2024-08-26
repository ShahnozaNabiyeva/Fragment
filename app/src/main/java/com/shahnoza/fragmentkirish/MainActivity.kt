package com.shahnoza.fragmentkirish

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    lateinit var replace:Button
    lateinit var container:LinearLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        container=findViewById(R.id.container)
        btn=findViewById(R.id.btnGet)
        replace=findViewById(R.id.btnReplace)

        val blankFragment=BlankFragment()
        val finalFragment2=FinalFragment2()
        val fragmentManager=supportFragmentManager
        val transaction=fragmentManager.beginTransaction()

        btn.setOnClickListener {

            transaction.add(R.id.container,blankFragment)
            transaction.commit()
            btn.visibility = View.INVISIBLE
            replace.visibility=View.VISIBLE
        }
        replace.setOnClickListener {
            val transaction=fragmentManager.beginTransaction()
            transaction.add(R.id.container,finalFragment2)
            transaction.commit()

        // transaction.replace(R.id.lin,finalFragment2)
        }


















    }
}