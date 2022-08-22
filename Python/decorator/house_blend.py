from decorator.beverage import Beverage


class HouseBlend(Beverage):
    def __init__(self):
        self._description = "하우스 블렌드"

    def cost(self):
        return 0.89
