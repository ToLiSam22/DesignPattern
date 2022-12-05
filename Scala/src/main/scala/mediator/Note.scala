package mediator

/**
 * Note class.
 */
class Note() {
  private var name = "new note"
  private var text = ""

  def setName(name: String): Unit = {
    this.name = name
  }

  def setText(text: String): Unit = {
    this.text = text
  }

  def getName: String = name

  def getText: String = text

  override def toString: String = name
}
