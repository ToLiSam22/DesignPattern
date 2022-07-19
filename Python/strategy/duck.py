from abc import ABC
from abc import abstractmethod

from strategy.fly_behivor import FlyBehavior
from strategy.fly_behivor import FlyNoWay
from strategy.fly_behivor import FlyWithWings
from strategy.quack_behavior import MuteQuack
from strategy.quack_behavior import Quack
from strategy.quack_behavior import QuackBehavior
from strategy.quack_behavior import Squeak


class Duck(ABC):
    fly_behavior: FlyBehavior
    quack_behavior: QuackBehavior

    @abstractmethod
    def display(self):
        pass

    def swim(self):
        print("물에 둥둥")

    def perform_fly(self):
        self.fly_behavior.fly()

    def perform_quack(self):
        self.quack_behavior.quack()

    def set_fly_behavior(self, fly):
        self.fly_behavior = fly

    def set_quack_behavior(self, quack):
        self.quack_behavior = quack


class MallardDuck(Duck):
    def __init__(self):
        self.fly_behavior = FlyWithWings()
        self.quack_behavior = Quack()

    def display(self):
        print("MallardDuck")


class RedHeadDuck(Duck):
    def __init__(self):
        self.fly_behavior = FlyWithWings()
        self.quack_behavior = Squeak()

    def display(self):
        print("RedHeadDuck")


class RubberDuck(Duck):
    def __init__(self):
        self.fly_behavior = FlyNoWay()
        self.quack_behavior = MuteQuack()

    def display(self):
        print("RubberDuck")
