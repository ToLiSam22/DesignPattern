from decorator.beverage import Beverage


class DarkRoast(Beverage):
    def __init__(self):
        self._description = "다크로스트"

    def cost(self):
        return 0.99
