package mediator

import mediator.Mediator
import javax.swing._


/**
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 */
import mediator.Mediator
import javax.swing.DefaultListModel
import javax.swing.JList

class NoteList(val LIST_MODEL: DefaultListModel[Note]) extends JList[Note](LIST_MODEL) with Component {
  setModel(LIST_MODEL)
  this.setLayoutOrientation(JList.VERTICAL)
  val thread = new Thread(new Hide(this))
  thread.start()
  private var mediator: Option[Mediator] = None

  def setMediator(mediator: Mediator): Unit = {
    this.mediator = Some(mediator)
  }

  def addElement(note: Note): Unit = {
    LIST_MODEL.addElement(note)
    val index = LIST_MODEL.size - 1
    setSelectedIndex(index)
    ensureIndexIsVisible(index)
    mediator.foreach(_.sendToFilter(LIST_MODEL))
  }

  def deleteElement(): Unit = {
    val index = this.getSelectedIndex
    try {
      LIST_MODEL.remove(index)
      mediator.foreach(_.sendToFilter(LIST_MODEL))
    } catch {
      case ignored: ArrayIndexOutOfBoundsException => {}
    }
  }

  def getCurrentElement: Note = getSelectedValue.asInstanceOf[Note]

  override def getName = "List"

  private class Hide(var list: NoteList) extends Runnable {
    override def run(): Unit = {
      while ( {
        true
      }) {
        try Thread.sleep(300)
        catch {
          case ex: InterruptedException =>
            ex.printStackTrace()
        }
        if (list.isSelectionEmpty) mediator.foreach(_.hideElements(true))
        else mediator.foreach(_.hideElements(false))
      }
    }
  }
}