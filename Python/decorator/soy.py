from decorator.condiment_decorator import CondimentDecorator


class Soy(CondimentDecorator):
    def __init__(self, beverage):
        self._description = ", 두유"
        self.beverage = beverage

    def cost(self):
        return self.beverage.cost() + 0.15
