package mediator


import mediator.Component

import javax.swing._
import javax.swing.border.LineBorder
import java.awt._
import javax.swing.event.ListSelectionEvent


/**
 * Concrete mediator. All chaotic communications between concrete components
 * have been extracted to the mediator. Now components only talk with the
 * mediator, which knows who has to handle a request.
 */
class Editor extends Mediator {
  private var title: Option[Title] = None
  private var textBox: Option[TextBox] = None
  private var add: Option[AddButton] = None
  private var del: Option[DeleteButton] = None
  private var save: Option[SaveButton] = None
  private var list: Option[NoteList] = None
  private var filter: Option[Filter] = None
  private val titleLabel = new JLabel("Title:")
  private val textLabel = new JLabel("Text:")
  private val label = new JLabel("Add or select existing note to proceed...")

  /**
   * Here the registration of components by the mediator.
   */
  def registerComponent(component: Component): Unit = {
    component.setMediator(this)
    component.getName match {
      case "AddButton" =>
        add = Some(component.asInstanceOf[AddButton])

      case "DelButton" =>
        del = Some(component.asInstanceOf[DeleteButton])

      case "Filter" =>
        filter = Some(component.asInstanceOf[Filter])

      case "List" =>
        list = Some(component.asInstanceOf[NoteList])
        this.list.foreach(_.addListSelectionListener(listSelectionEvent => {
          val note = list.map(_.getSelectedValue)
          note match {
            case None => clear()
            case Some(x) => if (x == null) clear() else getInfoFromList(x)
          }
        }))

      case "SaveButton" =>
        save = Some(component.asInstanceOf[SaveButton])

      case "TextBox" =>
        textBox = Some(component.asInstanceOf[TextBox])

      case "Title" =>
        title = Some(component.asInstanceOf[Title])

    }
  }

  /**
   * Various methods to handle requests from particular components.
   */
  def addNewNote(note: Note): Unit = {
    title.foreach(_.setText(""))
    textBox.foreach(_.setText(""))
    list.foreach(_.addElement(note))
  }

  override def deleteNote(): Unit = {
    list.foreach(x => {
      x.deleteElement()
    })
  }

  def getInfoFromList(note: Note): Unit = {
    title.foreach(_.setText(note.getName.replace('*', ' ')))
    textBox.foreach(_.setText(note.getText))
  }

  override def saveChanges(): Unit = {
      val note = list.map(_.getSelectedValue)
      note.foreach(x => {
        x.setName(title.map(_.getText).getOrElse(""))
        x.setText(textBox.map(_.getText).getOrElse(""))
      })
      list.foreach(_.repaint())
  }

  override def markNote(): Unit = {
    val note = list.map(_.getCurrentElement)
    val name = note.map(_.getName)
    name.foreach(x => {
      if (!x.endsWith("*")) note.foreach(_.setName(x + "*"))
      list.foreach(_.repaint())
    })
  }

  override def clear(): Unit = {
    title.foreach(_.setText(""))
    textBox.foreach(_.setText(""))
  }

  override def sendToFilter(listModel: ListModel[Note]): Unit = {
    filter.foreach(_.setList(listModel))
  }

  override def setElementsList(list: ListModel[Note]): Unit = {
    this.list.foreach(x => {
      x.setModel(list)
      x.repaint()
    })
  }

  override def hideElements(flag: Boolean): Unit = {
    titleLabel.setVisible(!flag)
    textLabel.setVisible(!flag)
    title.foreach(_.setVisible(!flag))
    textBox.foreach(_.setVisible(!flag))
    save.foreach(_.setVisible(!flag))
    label.setVisible(flag)
  }

  override def createGUI(): Unit = {
    val notes = new JFrame("Notes")
    notes.setSize(960, 600)
    notes.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
    val left = new JPanel
    left.setBorder(new LineBorder(Color.BLACK))
    left.setSize(320, 600)
    left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS))
    val filterPanel = new JPanel
    filterPanel.add(new JLabel("Filter:"))
    filter.foreach(_.setColumns(20))
    filterPanel.add(filter.orNull)
    filterPanel.setPreferredSize(new Dimension(280, 40))
    val listPanel = new JPanel
    list.foreach(_.setFixedCellWidth(260))
    listPanel.setSize(320, 470)
    val scrollPane = new JScrollPane(list.orNull)
    scrollPane.setPreferredSize(new Dimension(275, 410))
    listPanel.add(scrollPane)
    val buttonPanel = new JPanel
    add.foreach(_.setPreferredSize(new Dimension(85, 25)))
    buttonPanel.add(add.orNull)
    del.foreach(_.setPreferredSize(new Dimension(85, 25)))
    buttonPanel.add(del.orNull)
    buttonPanel.setLayout(new FlowLayout)
    left.add(filterPanel)
    left.add(listPanel)
    left.add(buttonPanel)
    val right = new JPanel
    right.setLayout(null)
    right.setSize(640, 600)
    right.setLocation(320, 0)
    right.setBorder(new LineBorder(Color.BLACK))
    titleLabel.setBounds(20, 4, 50, 20)
    title.foreach(_.setBounds(60, 5, 555, 20))
    textLabel.setBounds(20, 4, 50, 130)
    textBox.foreach(_.setBorder(new LineBorder(Color.DARK_GRAY)))
    textBox.foreach(_.setBounds(20, 80, 595, 410))
    save.foreach(_.setBounds(270, 535, 80, 25))
    label.setFont(new Font("Verdana", Font.PLAIN, 22))
    label.setBounds(100, 240, 500, 100)
    right.add(label)
    right.add(titleLabel)
    right.add(title.orNull)
    right.add(textLabel)
    right.add(textBox.orNull)
    right.add(save.orNull)
    notes.setLayout(null)
    notes.getContentPane.add(left)
    notes.getContentPane.add(right)
    notes.setResizable(false)
    notes.setLocationRelativeTo(null)
    notes.setVisible(true)
  }
}