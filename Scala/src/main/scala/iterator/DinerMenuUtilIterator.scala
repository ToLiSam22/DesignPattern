package iterator

class DinerMenuUtilIterator(menu: Array[MenuItem]) extends java.util.Iterator[MenuItem] {
  private var position = 0

  override def hasNext: Boolean = {
    if (position >= menu.length || menu(position) == null) {
      false
    } else {
      true
    }
  }

  override def next: MenuItem = {
    val menuItem = menu(position)
    position += 1
    menuItem
  }
}
