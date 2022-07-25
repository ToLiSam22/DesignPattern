package duck;

import behavior.FlyWithWings;
import behavior.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        TAG = "MallardDuck";
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
