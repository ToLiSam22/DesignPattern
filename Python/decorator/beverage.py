from abc import ABC
from abc import abstractmethod


class Beverage(ABC):
    _description: str

    @property
    def description(self):
        return self._description

    @abstractmethod
    def cost(self):
        pass
