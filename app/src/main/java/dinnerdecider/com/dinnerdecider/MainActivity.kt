package dinnerdecider.com.dinnerdecider

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnDinnerDecider = findViewById<Button>(R.id.btnDinnerDecider)
        val btnNumberToWord = findViewById<Button>(R.id.btn_num_to_word)

        btnDinnerDecider.setOnClickListener {
//            Toast.makeText(applicationContext,"Clicked",Toast.LENGTH_SHORT).show()
            val intentDinnerDecider = Intent(this, DinnerDecider::class.java)
            startActivity(intentDinnerDecider)
        }
       
        btnNumberToWord.setOnClickListener {
            val intentNumToWord = Intent(this, NumberToWord::class.java)
            startActivity(intentNumToWord)
        }
    }


}