package dinnerdecider.com.dinnerdecider

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OrderActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_list_activity)
//        val navBarTitle = "Order"
//        supportActionBar?.title = navBarTitle
        val textviewDrinkOrder = findViewById<TextView>(R.id.id_text_view_drink_order)
        val textviewFoodOrder = findViewById<TextView>(R.id.id_text_view_food_order)

        val intent = intent
        val outputFood = intent.getStringExtra("OrderFood")
        val outputDrink = intent.getStringExtra("OrderDrink")

        textviewFoodOrder.text = "Food: $outputFood"
        textviewDrinkOrder.text = "Drink:  $outputDrink"
    }
}
