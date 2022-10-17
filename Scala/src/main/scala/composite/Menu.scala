package composite

import java.util

class Menu(name: String, description: String) extends MenuComponent {

  val menuComponents = new util.ArrayList[MenuComponent]()

  override def getName: String = name

  override def getDescription: String = description

  override def add(menuComponent: MenuComponent): Unit = menuComponents.add(menuComponent)

  override def remove(menuComponent: MenuComponent): Unit = menuComponents.remove(menuComponent)

  override def getChild(position: Int): MenuComponent = menuComponents.get(position)

  override def printMenu(): Unit = {
    print("\n" + getName)
    println(", " + getDescription)
    println("---------------")
    menuComponents.forEach(_.printMenu())
  }
}
