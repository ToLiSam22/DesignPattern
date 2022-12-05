package mediator

import mediator.Mediator
import javax.swing._
import java.awt.event.KeyEvent


/**
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 */
class TextBox extends JTextArea with Component {
  private var mediator: Option[Mediator] = None

  def setMediator(mediator: Mediator): Unit = {
    this.mediator = Some(mediator)
  }

  override protected def processComponentKeyEvent(keyEvent: KeyEvent): Unit = {
    mediator.foreach(_.markNote())
  }

  override def getName = "TextBox"
}
