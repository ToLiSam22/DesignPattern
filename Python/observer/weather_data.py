from typing import List

from custom_observer import Observer
from observer.subject import Subject


class WeatherData(Subject):
    _observer: List[Observer]
    _temperature: float
    _humidity: float
    _pressure: float

    def __init__(self):
        self._observers = []
        self._temperature = 0.0
        self._humidity = 0.0
        self._pressure = 0.0

    @property
    def temperature(self):
        return self._temperature

    @property
    def humidity(self):
        return self._humidity

    @property
    def pressure(self):
        return self._pressure

    def register_observer(self, observer: Observer):
        self._observers.append(observer)

    def remove_observer(self, observer: Observer):
        self._observers.remove(observer)

    def notify_observers(self):
        for observer in self._observers:
            observer.update()

    def measurements_changed(self):
        self.notify_observers()

    def set_measurements(self, temperature, humidity, pressure):
        self._temperature = temperature
        self._humidity = humidity
        self._pressure = pressure
        self.measurements_changed()
