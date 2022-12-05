package visitor

class Circle(val id: Int, val _x: Int, val _y: Int, radius: Int) extends Dot(id, _x, _y) {
  override def accept(visitor: Visitor): String = visitor.visitCircle(this)

  def getRadius: Int = radius
}

