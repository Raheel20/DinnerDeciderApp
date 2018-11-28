package dinnerdecider.com.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
class NumberToWord : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_to_word)
        
        val buttonConvertNumberToWord = findViewById<Button>(R.id.id_button_convert_number)
        val editTextInputNumber = findViewById<EditText>(R.id.id_edit_text_input_number)
       val textViewNumberInWord = findViewById<TextView>(R.id.id_text_view_number_in_word)
        buttonConvertNumberToWord.setOnClickListener {
            val number = editTextInputNumber.text.toString()
        
            var intNumber = number.toInt()
            textViewNumberInWord.text=" "
            
            while (intNumber != 0) when (intNumber) {
                1 -> {
                    textViewNumberInWord.text = getString(R.string.one)
                    intNumber = 0
                }

                2 -> {
                    textViewNumberInWord.text = getString(R.string.two)
                    intNumber = 0
                }
                3 -> {
                    textViewNumberInWord.text = getString(R.string.three)
                    intNumber = 0
                }
                4 -> {
                    textViewNumberInWord.text = getString(R.string.four)
                    intNumber = 0
                }
                5 -> {
                    textViewNumberInWord.text = getString(R.string.five)
                    intNumber = 0
                }
                6 -> {
                    textViewNumberInWord.text = getString(R.string.six)
                    intNumber = 0
                }
                7 -> {
                    textViewNumberInWord.text = getString(R.string.seven)
                    intNumber = 0
                }
                8 -> {
                    textViewNumberInWord.text = getString(R.string.eight)
                    intNumber = 0
                }
                9 -> {
                    textViewNumberInWord.text = getString(R.string.nine)
                    intNumber = 0
                }
                10 -> {
                    textViewNumberInWord.text = getString(R.string.ten)
                    intNumber = 0
                }
                11 -> {
                    textViewNumberInWord.text = getString(R.string.eleven)
                    intNumber = 0
                }
                12 -> {
                    textViewNumberInWord.text = getString(R.string.twelve)
                    intNumber = 0
                }
                13 -> {
                    textViewNumberInWord.text = getString(R.string.thirteen)
                    intNumber = 0
                }
                14 -> {
                    textViewNumberInWord.text = getString(R.string.fourteen)
                    intNumber = 0
                }
                15 -> {
                    textViewNumberInWord.text = getString(R.string.fifteen)
                    intNumber = 0
                }
                16 -> {
                    textViewNumberInWord.text = getString(R.string.sixteen)
                    intNumber = 0
                }
                17 -> {
                    textViewNumberInWord.text = getString(R.string.seventeen)
                    intNumber = 0
                }
                18 -> {
                    textViewNumberInWord.text = getString(R.string.eighteen)
                    intNumber = 0
                }
                19 -> {
                    textViewNumberInWord.text = getString(R.string.nineteen)
                    intNumber = 0
                }


                in 20..29 -> {
                    textViewNumberInWord.text = getString(R.string.twenty)
                    intNumber -= 20
                }
                in 30..39 -> {
                    textViewNumberInWord.text = getString(R.string.thirty)
                    intNumber -= 30
                }
                in 40..49 -> {
                    textViewNumberInWord.text = getString(R.string.forty)
                    intNumber -= 40
                }
                in 50..59 -> {
                    textViewNumberInWord.text = getString(R.string.fifty)
                    intNumber -= 50
                }
                in 60..69 -> {
                    textViewNumberInWord.text = getString(R.string.sixty)
                    intNumber -= 60
                }
                in 70..79 -> {
                    textViewNumberInWord.text = getString(R.string.seventy)
                    intNumber -= 70
                }
                in 80..89 -> {
                    textViewNumberInWord.text = getString(R.string.eighty)
                    intNumber -= 80
                }
                in 90..99 -> {
                    textViewNumberInWord.text = getString(R.string.ninety)
                    intNumber -= 90
                }

            }
        }
  
    }
}
//
//        fun convert(mp: Int): String {
//            var m = mp
//            var str = ""
//            while (m != 0) {
//                when (m) {
//                    in 1..99 -> {
//                        str += oneToHundred(m)
//                        m = 0
//                    }
//                    in 100..999 -> {
//                        str += oneToHundred(m / 100)
//                        str = "$str Hundred"
//                        m %= 100
//                    }
//                    in 1000..9999 -> {
//                        str += oneToHundred(m / 1000)
//                        str = "$str Thousand"
//                        m %= 1000
//                    }
//                }
//            }



    
