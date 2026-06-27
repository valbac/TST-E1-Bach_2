package org.example
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val shoppingCart = ShoppingCart()

    shoppingCart.addItem("test1")
    shoppingCart.addItem("test2")
    shoppingCart.addItem("test3")
    println(shoppingCart.getTotalItems().size)
    println(shoppingCart.getItemNames())
}