package iterator

import java.util

class PancakeHouseMenuIterator(menu: util.ArrayList[MenuItem]) extends Iterator {
  private var position = 0
  override def hasNext: Boolean = menu.size() > position

  override def next: MenuItem = {
    val menuItem = menu.get(position)
    position += 1
    menuItem
  }
}
