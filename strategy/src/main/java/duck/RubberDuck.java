package duck;

import behavior.FlyNoWay;
import behavior.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("고무 오리입니다.");
    }

    @Override
    public void swim() {
        System.out.println("고무오리가 둥둥 떠다닙니다.");
    }
}
