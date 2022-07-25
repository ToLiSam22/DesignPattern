import behavior.FlyNoWay;
import duck.*;

public class DuckApplication {

    public static void main(String[] args) {
        Duck redheadDuck = new RedheadDuck();
        performDuckBehaviors(new MallardDuck());
        performDuckBehaviors(redheadDuck);
        performDuckBehaviors(new RubberDuck());
        performDuckBehaviors(new DecoyDuck());

        System.out.println(">> RedheadDuck hurts its wing! <<\n");
        redheadDuck.setFlyBehavior(new FlyNoWay());
        performDuckBehaviors(redheadDuck);
    }

    private static void performDuckBehaviors(Duck duck) {
        duck.display();
        duck.swim();
        duck.quack();
        duck.fly();
        System.out.println("");
    }
}
