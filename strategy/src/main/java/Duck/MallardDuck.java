package Duck;

import behavior.Fly;
import behavior.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        this.flyBehavior = new Fly();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("물오리 입니다.");
    }

    @Override
    public void swim() {
        System.out.println("물오리가 헤엄쳐다닙니다.");
    }
}
