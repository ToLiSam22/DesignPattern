from decorator.condiment_decorator import CondimentDecorator


class Mocha(CondimentDecorator):
    def __init__(self, beverage):
        self._description = ", 모카"
        self.beverage = beverage

    def cost(self):
        return self.beverage.cost() + 0.20
