from decorator.beverage import Beverage


class Espresso(Beverage):
    def __init__(self):
        self._description = "에스프레소"

    def cost(self):
        return 1.99
