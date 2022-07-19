from abc import ABC
from abc import abstractmethod


class QuackBehavior(ABC):
    @abstractmethod
    def quack(self):
        pass


class Quack(QuackBehavior):
    def quack(self):
        print("꽥꽥!")


class Squeak(QuackBehavior):
    def quack(self):
        print("삑삑~")


class MuteQuack(QuackBehavior):
    def quack(self):
        print("silence")
