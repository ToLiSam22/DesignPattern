package builder

class Planner (plans: Map[String, List[Plan]]) {
  def printPlan(): Unit = {
    plans.foreach(x => {
      println(x._1)
      x._2.foreach(p => println(f"\t${p.eventType} : ${p.name}"))
    })
  }
}

case class Plan(eventType: String, name: String)