package iterator

trait Iterator {
  def hasNext: Boolean
  def next: MenuItem
}
