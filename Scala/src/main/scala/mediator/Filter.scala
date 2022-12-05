package mediator

import mediator.Mediator
import javax.swing.DefaultListModel
import javax.swing.JTextField
import javax.swing.ListModel
import java.awt.event.KeyEvent
import java.util

/**
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 */
class Filter() extends JTextField with Component {
  private var mediator: Option[Mediator] = None
  private var listModel : Option[ListModel[Note]] = None

  override def setMediator(mediator: Mediator): Unit = {
    this.mediator = Some(mediator)
  }

  override protected def processComponentKeyEvent(keyEvent: KeyEvent): Unit = {
    val start = getText
    searchElements(start)
  }

  def setList(listModel: ListModel[Note]): Unit = {
    this.listModel = Some(listModel)
  }

  private def searchElements(s: String): Unit = {
    this.listModel.foreach(lm => {
      if (s.isEmpty) {
        this.mediator.foreach(_.setElementsList(lm))
      } else {
        val notes = new util.ArrayList[Note]
        for (i <- 0 until lm.getSize) {
          notes.add(lm.getElementAt(i))
        }
        val filteredListModel = new DefaultListModel[Note]
        notes.forEach(note => {
          if(note.getName.contains(s)) filteredListModel.addElement(note)
        })
        mediator.foreach(_.setElementsList(filteredListModel))
      }
    })
  }

  override def getName = "Filter"
}