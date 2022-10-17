package composite

trait MenuComponent {

  def getName: String = throw new UnsupportedOperationException()

  def getDescription: String = throw new UnsupportedOperationException()

  def getPrice: Double = throw new UnsupportedOperationException()

  def isVegetarian: Boolean = throw new UnsupportedOperationException()

  def printMenu(): Unit = throw new UnsupportedOperationException()

  def add(menuComponent: MenuComponent): Unit = throw new UnsupportedOperationException()

  def remove(menuComponent: MenuComponent): Unit = throw new UnsupportedOperationException()

  def getChild(position: Int): MenuComponent = throw new UnsupportedOperationException()

}
