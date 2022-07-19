from strategy.duck import MallardDuck
from strategy.duck import RedHeadDuck
from strategy.duck import RubberDuck
from strategy.fly_behivor import FlyWithWings
from strategy.quack_behavior import Quack
from strategy.quack_behavior import Squeak

if __name__ == "__main__":
    mallard_duck = MallardDuck()
    mallard_duck.display()
    mallard_duck.perform_fly()
    mallard_duck.perform_quack()

    red_head_duck = RedHeadDuck()
    red_head_duck.display()
    red_head_duck.perform_fly()
    red_head_duck.perform_quack()

    rubber_duck = RubberDuck()
    rubber_duck.display()
    rubber_duck.perform_fly()
    rubber_duck.perform_quack()
    rubber_duck.set_fly_behavior(FlyWithWings())
    rubber_duck.set_quack_behavior(Quack())
    rubber_duck.perform_fly()
    rubber_duck.perform_quack()
    rubber_duck.quack_behavior = Squeak()
    rubber_duck.perform_quack()
