import org.example.ShoppingCart
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

private lateinit var shoppingCart: ShoppingCart


class ShoppingCartTest {
    @BeforeEach
    fun setUp() {
        shoppingCart = ShoppingCart()
    }

    @Test
    fun test_empty_cart_has_zero_total(){
        assertEquals(0, shoppingCart.getTotalItems().size)
    }

    @Test
    fun test_add_item_increases_total(){
        shoppingCart.addItem("test")

        assertEquals(1, shoppingCart.getTotalItems().size)
    }

    @Test
    fun test_add_multiple_items_sums_total(){
        shoppingCart.addItem("test1")
        shoppingCart.addItem("test2")
        shoppingCart.addItem("test3")

        assertEquals("test1 test2 test3", shoppingCart.getItemNames())
        assertEquals(3, shoppingCart.getTotalItems().size)
    }

    @Test
    fun test_get_quantity_of_item(){
        shoppingCart.addItem("Apple")
        shoppingCart.addItem("Apple")
        shoppingCart.addItem("Orange")

        assertEquals(2, shoppingCart.getItemAmount("Apple"))
        assertEquals(3, shoppingCart.getTotalItems().size)
    }
}