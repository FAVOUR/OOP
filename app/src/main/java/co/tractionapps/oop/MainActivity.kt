package co.tractionapps.oop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.tractionapps.oop.food_types.EwaAgoyin
import co.tractionapps.oop.interfaces.Food

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

 fun main(args: Array<String>){

     val food: Food = EwaAgoyin(keyIngredient = "Beans")

     println()
 }