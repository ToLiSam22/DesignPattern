package visitor

object Demo extends App {

  val dot = new Dot(1, 10, 55)
  val circle = new Circle(2, 23, 15, 10)
  val rectangle = new Rectangle(3, 10, 17, 20, 30)

  val compoundShape = new CompoundShape(4)
  compoundShape.add(dot)
  compoundShape.add(circle)
  compoundShape.add(rectangle)

  val c = new CompoundShape(5)
  c.add(dot)
  compoundShape.add(c)

  export(circle, compoundShape)

  private def export(shapes: Shape*): Unit = {
    val exportVisitor = new XMLExportVisitor
    println(exportVisitor.`export`(shapes))
  }

}
