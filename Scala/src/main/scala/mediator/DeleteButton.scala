package mediator

import mediator.Mediator
import javax.swing.JButton
import java.awt.event.ActionEvent

/**
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 */
class DeleteButton() extends JButton("Del") with Component {
  private var mediator: Option[Mediator] = None

  override def setMediator(mediator: Mediator): Unit = {
    this.mediator = Some(mediator)
  }

  override protected def fireActionPerformed(actionEvent: ActionEvent): Unit = {
    mediator.foreach(_.deleteNote())
  }

  override def getName = "DelButton"
}
