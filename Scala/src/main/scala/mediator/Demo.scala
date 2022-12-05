package mediator

import mediator.AddButton
import mediator.DeleteButton
import mediator.Mediator
import mediator.SaveButton
import mediator.TextBox
import mediator.Title
import javax.swing._


/**
 * Demo class. Everything comes together here.
 */
object Demo extends App{
    val mediator = new Editor()
    mediator.registerComponent(new Title)
    mediator.registerComponent(new TextBox)
    mediator.registerComponent(new AddButton)
    mediator.registerComponent(new DeleteButton)
    mediator.registerComponent(new SaveButton)
    mediator.registerComponent(new NoteList(new DefaultListModel[Note]))
    mediator.registerComponent(new Filter)
    mediator.createGUI()

}
