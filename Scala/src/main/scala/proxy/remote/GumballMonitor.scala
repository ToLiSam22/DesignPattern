package proxy.remote

import java.rmi._

class GumballMonitor(machine: GumballMachineRemote) {
  def report(): Unit = {
    try {
      println(s"뽑기 기계 위치: ${machine.getLocation}")
      println(s"현재 재고: ${machine.getCount}")
      println(s"현재 상태: ${machine.getState}")
    } catch {
      case e: RemoteException => e.printStackTrace()
    }
  }

}
