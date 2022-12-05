package visitor

class Dot(id: Int, _x: Int, _y: Int) extends Shape {
  private var x = _x
  private var y = _y

  override def move(x: Int, y: Int): Unit = {
    // move shape
  }

  override def draw(): Unit = {
    // draw shape
  }

  override def accept(visitor: Visitor): String = visitor.visitDot(this)

  def getX: Int = x

  def getY: Int = y

  def getId: Int = id
}