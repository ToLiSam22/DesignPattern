package builder

import scala.collection.mutable

class VacationBuilder extends Builder{

  private val plans: mutable.Map[String, mutable.ListBuffer[Plan]] = mutable.Map()

  private def addPlan(date: String, plan: Plan): Unit = {
    val dayPlan = plans.getOrElse(date, new mutable.ListBuffer())
    dayPlan += plan
    plans(date) = dayPlan
  }

  override def addHotel(date: String, name: String): Unit = addPlan(date, Plan("hotel", name))

  override def addReservation(date: String, name: String): Unit =  addPlan(date, Plan("reservation", name))

  override def addSpecialEvent(date: String, name: String): Unit =  addPlan(date, Plan("special_event", name))

  override def addTickets(date: String, name: String): Unit =  addPlan(date, Plan("ticket", name))

  override def getVacationPlanner(): Planner = {
    val immutablePlans = plans.map(x => (x._1, x._2.toList)).toMap
    new Planner(immutablePlans)
  }
}
