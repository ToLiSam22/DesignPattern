from decorator.condiment_decorator import CondimentDecorator


class Whip(CondimentDecorator):
    def __init__(self, beverage):
        self._description = ", 휘핑크림"
        self.beverage = beverage

    def cost(self):
        return self.beverage.cost() + 0.10
