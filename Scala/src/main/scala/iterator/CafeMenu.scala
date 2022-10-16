package iterator

import java.util

class CafeMenu extends Menu {
  override val name: String = "저녁 메뉴" +
    ""
  private val menu = new util.HashMap[String, MenuItem]
  addItem(MenuItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자 튀김이 첨가된 베지 버거", vegetarian = true, 3.99) )
  addItem(MenuItem("오늘의 스프", "샐러드가 곁들여진 오늘의 스프", vegetarian = false, 3.69))
  addItem(MenuItem("부리토", "통 핀토콩과 살사, 구아카몰이 곁들여진 푸짐한 부리토", vegetarian = true, 4.29))

  override def addItem(menuItem: MenuItem): Unit = {
    menu.put(menuItem.name, menuItem)
  }

  override def createUtilIterator: util.Iterator[MenuItem] = menu.values().iterator()
}
