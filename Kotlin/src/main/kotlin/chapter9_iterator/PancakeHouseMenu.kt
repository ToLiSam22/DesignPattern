package chapter9_iterator

import java.math.BigDecimal

class PancakeHouseMenu {
    var menuItems: MutableList<MenuItem> = mutableListOf();

    init {
        addItem(
            name = "K&B 팬케이크 세트",
            description = "스크램블 에그와 토스트가 곁들여진 팬케이크",
            vegetarian = true,
            price = BigDecimal(2.99),
        )

        addItem(
            name = "레귤러 팬케이크 세트",
            description = "달걀 프라이와 소시지가 곁들여진 팬케이크",
            vegetarian = false,
            price = BigDecimal(2.99),
        )
    }

    private fun addItem(name: String, description: String, vegetarian: Boolean, price: BigDecimal) {
        menuItems.add(
            MenuItem(name = name, description = description, vegetarian = vegetarian, price = price)
        )
    }

    fun getIterator(): Iterator = PancakeIterator(menuItems)
}