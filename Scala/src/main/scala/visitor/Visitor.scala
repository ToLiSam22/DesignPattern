package visitor

trait Visitor {

  def visitDot(dot: Dot): String

  def visitCircle(circle: Circle): String

  def visitRectangle(rectangle: Rectangle): String

  def visitCompoundGraphic(cg: CompoundShape): String
}
