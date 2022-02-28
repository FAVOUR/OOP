package co.tractionapps.oop.interfaces

import co.tractionapps.oop.food_types.Colours

interface Food {

    fun colour(): Colours

    fun keyIngredient():String

    fun isOliNeeded():Boolean
}
