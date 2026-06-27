package org.example

import kotlin.collections.List

data class Item(val name: String)
class ShoppingCart {
    private val items = mutableListOf<Item>()

    fun getTotalItems(): List<Item> = items.toList()

    fun addItem(name: String): Item {
        if (name.isBlank()) {
            throw IllegalArgumentException("Task description cannot be empty")
        }
        val newItem = Item(name = name.trim())
        items.add(newItem)
        return newItem
    }

    fun getItemNames(): String {
        return items.joinToString(separator = " ") { it.name }
    }

    fun getItemAmount(name: String): Int {
        if (name.isBlank()) {
            throw IllegalArgumentException("Task description cannot be empty")
        }
        return items.count { it.name == name }
    }
}