package org.example

import kotlin.collections.List

data class Item(val name: String)
class ShoppingCart {
    private val items = mutableListOf<Item>()

    fun getTotalItems(): List<Item> = items.toList()
}