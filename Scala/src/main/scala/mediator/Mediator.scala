package mediator

import javax.swing.ListModel

trait Mediator {
  def addNewNote(note: Note): Unit

  def deleteNote(): Unit

  def getInfoFromList(note: Note): Unit

  def saveChanges(): Unit

  def markNote(): Unit

  def clear(): Unit

  def sendToFilter(listModel: ListModel[Note]): Unit

  def setElementsList(list: ListModel[Note]): Unit

  def registerComponent(component: Component): Unit

  def hideElements(flag: Boolean): Unit

  def createGUI(): Unit
}