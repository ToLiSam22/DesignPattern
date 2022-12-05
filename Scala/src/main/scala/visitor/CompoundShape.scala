package visitor

import java.util


class CompoundShape(var id: Int) extends Shape {
  val children = new util.ArrayList[Shape]

  override def move(x: Int, y: Int): Unit = {
    // move shape
  }

  override def draw(): Unit = {
    // draw shape
  }

  def getId: Int = id

  override def accept(visitor: Visitor): String = visitor.visitCompoundGraphic(this)

  def add(shape: Shape): Unit = {
    children.add(shape)
  }
}
