package chapter9_iterator

import java.math.BigDecimal

data class MenuItem(
    private val name: String,
    private val description: String,
    private val vegetarian: Boolean,
    private val price: BigDecimal,
) {
    override fun toString(): String {
        return "$name, $price -- $description"
    }
}