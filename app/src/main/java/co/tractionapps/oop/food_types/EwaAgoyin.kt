package co.tractionapps.oop.food_types

import co.tractionapps.oop.Constant.YORUBA_LAND
import co.tractionapps.oop.interfaces.Food

class EwaAgoyin(val keyIngredient:String =""):Food {

    override fun colour(): Colours {
       return Colours.BLUE
    }

    override fun keyIngredient(): String {
       return keyIngredient
    }


    override fun isOliNeeded(): Boolean {
        return true
    }

    private fun originatedFrom(): String{
        return YORUBA_LAND
    }



}