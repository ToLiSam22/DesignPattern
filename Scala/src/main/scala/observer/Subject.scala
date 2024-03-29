package observer

trait Subject {
  def registerObserver(observer: Observer)

  def removeObserver(observer: Observer)

  def notifyObservers()
}
