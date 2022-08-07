from custom_observer import Observer
from display_element import DisplayElement
from weather_data import WeatherData


class CurrentConditionDisplay(Observer, DisplayElement):
    _weather_data: WeatherData
    _temperature: float
    _humidity: float

    def __init__(self, weather_data: WeatherData):
        self._weather_data = weather_data
        self._weather_data.register_observer(self)

    def update(self):
        self._temperature = self._weather_data.temperature
        self._humidity = self._weather_data.humidity
        self.display()

    def display(self):
        print(f"현재 상태: 온도 {self._temperature}F, 습도 {self._humidity}%")
