package proxy.remote

import java.rmi._

trait GumballMachineRemote extends Remote {
  @throws[RemoteException]
  def getCount: Int

  @throws[RemoteException]
  def getLocation: String

  @throws[RemoteException]
  def getState: State
}
