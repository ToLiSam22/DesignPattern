package builder

object VacationClient extends App{

  val vacationBuilder = new VacationBuilder()

  vacationBuilder.addHotel("2022-11-20", "hilton")
  vacationBuilder.addReservation("2022-11-20", "swimming pool")
  vacationBuilder.addTickets("2022-11-20", "magic show")
  vacationBuilder.addHotel("2022-11-21", "hilton")
  vacationBuilder.addTickets("2022-11-21", "movie")
  vacationBuilder.addSpecialEvent("2022-11-21", "dining event")

  val planner = vacationBuilder.getVacationPlanner()
  planner.printPlan()
}
