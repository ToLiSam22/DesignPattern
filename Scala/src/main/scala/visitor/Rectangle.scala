package visitor

class Rectangle(id: Int, private var x: Int, private var y: Int, private var width: Int, private var height: Int) extends Shape {
  def accept(visitor: Visitor): String = visitor.visitRectangle(this)

  def move(x: Int, y: Int): Unit = {
    // move shape
  }

  def draw(): Unit = {
    // draw shape
  }

  def getId: Int = id

  def getX: Int = x

  def getY: Int = y

  def getWidth: Int = width

  def getHeight: Int = height
}