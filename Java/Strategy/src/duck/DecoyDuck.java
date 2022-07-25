package duck;

import behavior.FlyNoWay;
import behavior.QuackNoWay;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        TAG = "DecoyDuck";
        quackBehavior = new QuackNoWay();
        flyBehavior = new FlyNoWay();
    }
}
