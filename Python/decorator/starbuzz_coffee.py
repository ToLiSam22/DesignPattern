from decorator.darkroast import DarkRoast
from decorator.espresso import Espresso
from decorator.house_blend import HouseBlend
from decorator.mocha import Mocha
from decorator.soy import Soy
from decorator.whip import Whip

if __name__ == "__main__":
    beverage = Espresso()
    print(f"{beverage.description} ${beverage.cost()}")

    beverage2 = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    print(f"{beverage2.description} ${beverage2.cost()}")

    beverage3 = HouseBlend()
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)
    print(f"{beverage3.description} ${beverage3.cost()}")
