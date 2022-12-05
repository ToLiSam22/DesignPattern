package visitor

trait Shape {
  def move(x: Int, y: Int): Unit

  def draw(): Unit

  def accept(visitor: Visitor): String
}