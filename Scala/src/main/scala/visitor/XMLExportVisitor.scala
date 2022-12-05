package visitor

import scala.collection.mutable

class XMLExportVisitor extends Visitor {
  def export(args: Seq[Shape]): String = {
    val sb = new mutable.StringBuilder
    sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n")
    args.foreach(shape => sb.append(shape.accept(this)).append("\n"))
    sb.toString
  }

  def visitDot(d: Dot): String = "<dot>" + "\n" + "    <id>" + d.getId + "</id>" + "\n" + "    <x>" + d.getX + "</x>" + "\n" + "    <y>" + d.getY + "</y>" + "\n" + "</dot>"

  def visitCircle(c: Circle): String = "<circle>" + "\n" + "    <id>" + c.getId + "</id>" + "\n" + "    <x>" + c.getX + "</x>" + "\n" + "    <y>" + c.getY + "</y>" + "\n" + "    <radius>" + c.getRadius + "</radius>" + "\n" + "</circle>"

  def visitRectangle(r: Rectangle): String = "<rectangle>" + "\n" + "    <id>" + r.getId + "</id>" + "\n" + "    <x>" + r.getX + "</x>" + "\n" + "    <y>" + r.getY + "</y>" + "\n" + "    <width>" + r.getWidth + "</width>" + "\n" + "    <height>" + r.getHeight + "</height>" + "\n" + "</rectangle>"

  def visitCompoundGraphic(cg: CompoundShape): String = "<compound_graphic>" + "\n" + "   <id>" + cg.getId + "</id>" + "\n" + visitChildren(cg) + "</compound_graphic>"

  private def visitChildren(cg: CompoundShape): String = {
    val sb = new mutable.StringBuilder
    cg.children.forEach(shape => {
      var obj = shape.accept(this)
      // Proper indentation for sub-objects.
      obj = "    " + obj.replace("\n", "\n    ") + "\n"
      sb.append(obj)
    })
    sb.toString
  }
}