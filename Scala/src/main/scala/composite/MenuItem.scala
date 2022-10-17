package composite

case class MenuItem(name: String, description: String, vegetarian: Boolean, price: Double) extends MenuComponent {

  override def getName: String = name

  override def getDescription: String = description

  override def getPrice: Double = price

  override def isVegetarian: Boolean = vegetarian

  override def printMenu(): Unit = {
    print("  " + getName)
    if (isVegetarian) print("(v)")
    println(", " + getPrice)
    println("    -- " + getDescription)
  }

}
