package mediator

import java.awt.event.ActionEvent
import javax.swing._

/**
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 */
class AddButton() extends JButton("Add") with Component {
  private var mediator: Option[Mediator] = None

  override def setMediator(mediator: Mediator): Unit = {
    this.mediator = Some(mediator)
  }

  override def fireActionPerformed(actionEvent: ActionEvent): Unit = {
    mediator.foreach(_.addNewNote(new Note()))
  }

  override def getName = "AddButton"

}
