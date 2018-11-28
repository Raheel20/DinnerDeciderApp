package dinnerdecider.com.dinnerdecider

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dinner_decider.*
import java.util.*

class DinnerDecider : AppCompatActivity() {

    private val foodList = arrayListOf("Biryani", "Karhai", "Zinger", "Pizza", "Beans")
    private val drinkList = arrayListOf("Diet Coke", "Sprite", "Dew", "Pespi", "Fanta")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dinner_decider)
        val buttonAddFood = findViewById<Button>(R.id.id_button_add_food)
        val buttonAddDrink = findViewById<Button>(R.id.id_button_add_drink)
        val buttonDecideFood = findViewById<Button>(R.id.id_button_decide_food)
        val buttonDecideDrink = findViewById<Button>(R.id.id_button_decide_drink)
        val textviewDrink = findViewById<TextView>(R.id.id_text_view_drink)
        val textviewFood = findViewById<TextView>(R.id.id_text_view_food)
        val editTextFood = findViewById<EditText>(R.id.id_edit_text_food)
        val editTextDrink = findViewById<EditText>(R.id.id_edit_text_drink)


        buttonAddFood.setOnClickListener {
            val newFoodItem = editTextFood.text.toString()
            foodList.add(newFoodItem)
            editTextFood.text.clear()
            Toast.makeText(applicationContext, "Food Added", Toast.LENGTH_LONG).show()
        }

        buttonAddDrink.setOnClickListener {
            val newDrinkItem = editTextDrink.text.toString()
            drinkList.add(newDrinkItem)
            editTextDrink.text.clear()
            Toast.makeText(applicationContext, "Drink Added", Toast.LENGTH_LONG).show()
        }
        buttonDecideFood.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            textviewFood.text = foodList[randomFood]
        }
        buttonDecideDrink.setOnClickListener {
            val random = Random()
            val randomDrink = random.nextInt(drinkList.count())
            textviewDrink.text = drinkList[randomDrink]
        }

        button_check_order.setOnClickListener {
            val outputFood = textviewFood.text.toString()
            val outputDrink = textviewDrink.text.toString()

            val intent = Intent(this, OrderActivity::class.java)
            intent.putExtra("OrderFood", outputFood)
            intent.putExtra("OrderDrink", outputDrink)
            startActivity(intent)
        }
    }
}


