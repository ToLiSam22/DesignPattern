package builder

trait Builder {
  def addHotel(date: String, name: String): Unit
  def addReservation(date: String, name: String): Unit
  def addSpecialEvent(date: String, name: String): Unit
  def addTickets(date: String, name: String): Unit
  def getVacationPlanner(): Planner
}
