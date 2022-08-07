from abc import ABC
from abc import abstractmethod


class Observer(ABC):
    @abstractmethod
    def update(self):
        pass
