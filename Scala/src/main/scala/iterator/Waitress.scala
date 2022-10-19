package iterator

class Waitress(menus: List[Menu]) {

  def printMenu(): Unit = {
    println("메뉴")
    menus.foreach(menu => {
      println("--------")
      println(menu.name)
      printMenu(menu.createUtilIterator)
    })
  }

  def printMenu(iterator: Iterator): Unit = {
    while (iterator.hasNext) {
      val menuItem = iterator.next
      println(menuItem.name + ", " + menuItem.price + " -- " + menuItem.description)
    }
  }

  def printMenu(iterator: java.util.Iterator[MenuItem]): Unit = {
    while (iterator.hasNext) {
      val menuItem = iterator.next
      println(menuItem.name + ", " + menuItem.price + " -- " + menuItem.description)
    }
  }
}
