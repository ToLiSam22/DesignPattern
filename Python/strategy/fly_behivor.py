from abc import ABC
from abc import abstractmethod


class FlyBehavior(ABC):
    @abstractmethod
    def fly(self):
        pass


class FlyWithWings(FlyBehavior):
    def fly(self):
        print("날고 있어요!")


class FlyNoWay(FlyBehavior):
    def fly(self):
        print("못 날아요ㅠ")
