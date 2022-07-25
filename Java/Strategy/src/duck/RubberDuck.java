package duck;

import behavior.FlyNoWay;
import behavior.FlyWithWings;
import behavior.Quack;
import behavior.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck() {
        TAG = "RubberDuck";
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
}
