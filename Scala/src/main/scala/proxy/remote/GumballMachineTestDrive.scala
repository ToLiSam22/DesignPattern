package proxy.remote

import java.rmi.registry.LocateRegistry

object GumballMachineTestDrive {

  def main(args: Array[String]): Unit = {
    try {
      val count = args(0).toInt
      val gumballMachine = new GumballMachine("local", count)

      val port = 1099
      val rmiRegistry = LocateRegistry.createRegistry(port)
      rmiRegistry.rebind("gumballmachine", gumballMachine)
      println("registered in rmiRegistry")
    } catch {
      case e: Exception => e.printStackTrace()
    }
  }
}
