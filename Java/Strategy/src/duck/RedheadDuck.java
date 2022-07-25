package duck;

import behavior.FlyWithWings;
import behavior.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        TAG = "RedheadDuck";
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
