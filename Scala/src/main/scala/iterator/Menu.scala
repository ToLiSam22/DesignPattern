package iterator

trait Menu {
  val name: String

  def addItem(menuItem: MenuItem)

  def createUtilIterator: java.util.Iterator[MenuItem]
}
