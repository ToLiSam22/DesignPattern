package composite

object MenuTestDrive extends App{

  val pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴")
  pancakeHouseMenu.add(MenuItem("K&B 팬케이크 세트", "스크램블 에그와 토스트가 곁들여진 팬케이크", vegetarian = true, 2.99))
  pancakeHouseMenu.add(MenuItem("레귤러 팬케이스 세트", "달걀프라이와 소시지가 곁들여진 팬케이크", vegetarian = false, 2.99))
  pancakeHouseMenu.add(MenuItem("블루베리 팬케이크", "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크", vegetarian = true, 3.49))
  pancakeHouseMenu.add(MenuItem("와플", "취향에 따라 블루베리나 딸기를 얹을 수 있는 와플", vegetarian = true, 3.59))

  val dinerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴")
  dinerMenu.add(MenuItem("채식주의자용 BLT", "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", vegetarian = true, 2.99))
  dinerMenu.add(MenuItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", vegetarian = false, 2.99))
  dinerMenu.add(MenuItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", vegetarian = false, 3.29))
  dinerMenu.add(MenuItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", vegetarian = false, 3.05))

  val cafeMenu = new Menu("카페 메뉴", "저녁 메뉴")
  cafeMenu.add(MenuItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자 튀김이 첨가된 베지 버거", vegetarian = true, 3.99) )
  cafeMenu.add(MenuItem("오늘의 스프", "샐러드가 곁들여진 오늘의 스프", vegetarian = false, 3.69))
  cafeMenu.add(MenuItem("부리토", "통 핀토콩과 살사, 구아카몰이 곁들여진 푸짐한 부리토", vegetarian = true, 4.29))

  val dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨 보세요")

  val allMenu = new Menu("전체 메뉴", "전체 메뉴")
  allMenu.add(pancakeHouseMenu)
  allMenu.add(dinerMenu)
  allMenu.add(cafeMenu)

  dinerMenu.add(MenuItem("파스타", "마리나라 소스 스파게티, 효모빵도 드립니다.", vegetarian = true, 3.89))
  dinerMenu.add(dessertMenu)
  dessertMenu.add(MenuItem("애플 파이", "바삭바삭한 크러스트에 바닐라 아이스크림이 얹혀있는 애플파이", vegetarian = true, 1.59))

  val waitress = new Waitress(allMenu)
  waitress.printMenu()
}
