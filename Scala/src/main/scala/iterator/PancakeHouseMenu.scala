package iterator

import java.util

class PancakeHouseMenu extends Menu {
  override val name: String = "아침 메뉴"

  private val menu = new util.ArrayList[MenuItem]
  addItem(MenuItem("K&B 팬케이크 세트", "스크램블 에그와 토스트가 곁들여진 팬케이크", vegetarian = true, 2.99))
  addItem(MenuItem("레귤러 팬케이스 세트", "달걀프라이와 소시지가 곁들여진 팬케이크", vegetarian = false, 2.99))
  addItem(MenuItem("블루베리 팬케이크", "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크", vegetarian = true, 3.49))
  addItem(MenuItem("와플", "취향에 따라 블루베리나 딸기를 얹을 수 있는 와플", vegetarian = true, 3.59))

  override def addItem(menuItem: MenuItem): Unit = menu.add(menuItem)

  def createIterator(): PancakeHouseMenuIterator = new PancakeHouseMenuIterator(menu)

  override def createUtilIterator: util.Iterator[MenuItem] = menu.iterator()
}
