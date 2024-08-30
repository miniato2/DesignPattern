import Duck.Duck;
import behavior.FlyBehavior;

import Duck.RubberDuck;
import Duck.MallardDuck;
import behavior.FlyNoWay;

public class Application {
    public static void main(String[] args) {

        Duck rubberDuck = new RubberDuck();

        FlyBehavior fly = new FlyNoWay();

        //동적으로 변경할 수 있음
        rubberDuck.setFlyBehavior(fly);

        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        Duck mallardDuck = new MallardDuck();

        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

    }
}
