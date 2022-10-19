package chapter9_iterator

import chapter8_template.Coffee
import chapter8_template.Tea

object MenuApplication  {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val pancakeHouseMenu: PancakeHouseMenu = PancakeHouseMenu()
        val dinerMenu: DinerMenu = DinerMenu()
        val waitress: Waitress = Waitress(pancakeHouseMenu, dinerMenu)

        waitress.printMenu()
    }
}