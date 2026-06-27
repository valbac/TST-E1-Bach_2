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
        val firstItem = shoppingCart.addItem("test")

        assertEquals(1, shoppingCart.getTotalItems().size)
    }

    @Test
    fun test_add_multiple_items_sums_total(){
        val firstItem = shoppingCart.addItem("test1")
        val secondItem = shoppingCart.addItem("test2")
        val thirdItem = shoppingCart.addItem("test3")

        assertEquals("test1 test2 test3", shoppingCart.printItems)
        assertEquals(3, shoppingCart.getTotalItems().size)
    }
}