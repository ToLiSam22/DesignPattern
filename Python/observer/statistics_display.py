from custom_observer import Observer
from display_element import DisplayElement
from weather_data import WeatherData


class StatisticsDisplay(Observer, DisplayElement):
    _weather_data: WeatherData
    _max_temp: float
    _min_temp: float
    _temp_sum: float
    _num_readings: int

    def __init__(self, weather_data: WeatherData):
        self._weather_data = weather_data
        self._weather_data.register_observer(self)
        self._max_temp = 0.0
        self._min_temp = 200
        self._temp_sum = 0.0
        self._num_readings = 0

    def update(self):
        temperature = self._weather_data.temperature
        self._temp_sum += temperature
        self._num_readings += 1

        self._max_temp = max(self._max_temp, temperature)
        self._min_temp = min(self._min_temp, temperature)
        self.display()

    def display(self):
        print(
            f"평균/최고/최저 온도: {self._temp_sum / self._num_readings}/{self._max_temp}/{self._min_temp}"
        )
