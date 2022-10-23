package proxy.remote

import java.rmi.registry.LocateRegistry

object GumballMonitorTestDriver {
  def main(args: Array[String]): Unit = {
    val locations = Set("127.0.0.1")
    val port = 1099
    val monitors: Array[GumballMonitor] = new Array[GumballMonitor](locations.size)

    locations.zipWithIndex.foreach {
      case (location, index) => {
        try {
          val registry = LocateRegistry.getRegistry(location, port)
          val machine = registry.lookup("gumballmachine").asInstanceOf[GumballMachineRemote]
          monitors(index) = new GumballMonitor(machine)
          println(monitors(index))
        } catch {
          case e: Exception => e.printStackTrace()
        }
      }
    }

    monitors.foreach(_.report())
  }
}
