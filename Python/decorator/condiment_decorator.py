from abc import ABC

from decorator.beverage import Beverage


class CondimentDecorator(Beverage, ABC):
    beverage: Beverage

    @property
    def description(self):
        return self.beverage.description + self._description
