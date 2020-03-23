package com.tutorial.hellokoding

import android.content.res.Resources
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import com.tutorial.hellokoding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
          binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //membuat variabel
//        val btnClickMe = findViewById(R.id.clickMe) as Button

        binding.clickMe .setOnClickListener {
            val name = binding.etInputName.text.toString().trim()
            val imgRes = resources.getIdentifier(name,"drawable",packageName)
            if(name == null || name.trim() == "")
                Toast.makeText(this@MainActivity,"anda harus memasukan nama ",Toast.LENGTH_SHORT).show()
            else if(name.equals(imgRes)){
                binding.tvGreeting.setText(name)
                //change image
                Toast.makeText(this@MainActivity,"nama logo tidak tersedia!",Toast.LENGTH_SHORT).show()
                val imgRes = resources.getIdentifier("athafariz","drawable",packageName)
                binding.ivLogo.setImageResource(imgRes)
            }else{
                binding.tvGreeting.setText(name)
                //change image
                binding.ivLogo.setImageResource(imgRes)
                Toast.makeText(this@MainActivity,"tersedia!",Toast.LENGTH_SHORT).show()
            }
        }

    }
}
