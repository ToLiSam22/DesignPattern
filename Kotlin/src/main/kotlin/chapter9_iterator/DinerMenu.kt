package chapter9_iterator

import java.math.BigDecimal

class DinerMenu {
    var menuItems = arrayOfNulls<MenuItem>(MAX_ITEMS)
    var numOfItems = 0

    init {
        addItem(
            name = "채식주의자용 BLT",
            description = "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴",
            vegetarian = true,
            price = BigDecimal(2.99),
        )

        addItem(
            name = "BLT",
            description = "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴",
            vegetarian = false,
            price = BigDecimal(2.99),
        )
    }

    private fun addItem(name: String, description: String, vegetarian: Boolean, price: BigDecimal) {
        if (numOfItems >= MAX_ITEMS) {
            println("죄송합니다. 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.")
        } else {
            menuItems.set(
                index = numOfItems++,
                value = MenuItem(name = name, description = description, vegetarian = vegetarian, price = price)
            )
        }
    }

    fun createIterator(): Iterator = DinerMenuIterator(this.menuItems)

    companion object {
        const val MAX_ITEMS = 6
    }
}