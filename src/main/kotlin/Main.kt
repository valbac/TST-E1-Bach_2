package org.example
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val shoppingCart = ShoppingCart()

    shoppingCart.addItem("Apple")
    shoppingCart.addItem("Apple")
    shoppingCart.addItem("Orange")
    println(shoppingCart.getTotalItems().size)
    println(shoppingCart.getItemNames())
    println(shoppingCart.getItemAmount("Apple"))
}