from abc import ABC
from abc import abstractmethod


class DisplayElement(ABC):
    @abstractmethod
    def display(self):
        pass
