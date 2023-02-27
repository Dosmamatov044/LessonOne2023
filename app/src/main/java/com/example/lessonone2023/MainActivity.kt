package com.example.lessonone2023

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

lateinit var textView:TextView
lateinit var button:Button

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=   findViewById(R.id.nameTextView)
       button=findViewById(R.id.clickButton)


        button.setOnClickListener {

         Thread{
             for (i in 0..20){
                 Thread.sleep(1000)
                  runOnUiThread {


                   textView.text="Отчет пошел :${i}"

                  }
             }}.start()
        }

    }


    override fun onResume() {
        super.onResume()



    }

    override fun onPause() {
        super.onPause()




    }



    override fun onStart() {
        super.onStart()


    }


    override fun onStop() {
        super.onStop()




    }


    override fun onDestroy() {
        super.onDestroy()

    }


}