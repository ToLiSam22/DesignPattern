package iterator

class DinerMenu extends Menu {
  override val name: String = "점심 메뉴"

  private val MaxItemCnt = 6
  private var itemCnt = 0

  private val menu: Array[MenuItem] = new Array[MenuItem](MaxItemCnt)
  addItem(MenuItem("채식주의자용 BLT", "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", vegetarian = true, 2.99))
  addItem(MenuItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", vegetarian = false, 2.99))
  addItem(MenuItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", vegetarian = false, 3.29))
  addItem(MenuItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", vegetarian = false, 3.05))

  override def addItem(menuItem: MenuItem): Unit = {
    if (itemCnt >= MaxItemCnt) {
      println("죄송합니다. 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다")
    } else {
      menu(itemCnt) = menuItem
      itemCnt += 1
    }
  }

  def createIterator(): DinerMenuIterator = new DinerMenuIterator(menu)

  override def createUtilIterator: java.util.Iterator[MenuItem] = new DinerMenuUtilIterator(menu)

}
