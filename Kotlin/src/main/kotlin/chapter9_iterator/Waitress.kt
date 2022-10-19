package chapter9_iterator

class Waitress(
    val pancakeHouseMenu: PancakeHouseMenu,
    val dinerMenu: DinerMenu,
) {
    fun printMenu() {
        val pancakeIterator = pancakeHouseMenu.getIterator()
        val dinerIterator = dinerMenu.createIterator()

        println("#### 아침 메뉴 ####")
        printMenu(pancakeIterator)

        println("#### 점심 메뉴 ####")
        printMenu(dinerIterator)
    }

    fun printMenu(iterator: Iterator) {
        while (iterator.hasNext()) {
            println(iterator.next())
        }
    }
}