package iterator

object MenuTestDriver extends App {
  val pancakeHouseMenu = new PancakeHouseMenu()
  val dinerMenu = new DinerMenu()
  val cafeMenu = new CafeMenu()

  val waitress = new Waitress(List(pancakeHouseMenu, dinerMenu, cafeMenu))
  waitress.printMenu()
}
