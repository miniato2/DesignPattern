package Duck;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

public abstract class Duck {

    //Duck에서 Behavior를 인스턴스 변수로 사용하여, 3번째 디자인 원칙인 ‘상속보다는 구성을 사용한다.' 지켜짐
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void display(){}
    public void swim(){}

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    /* 알고리즘군을 교체할 수 있게끔 하기위하여 setter를 추가 */
    public void setFlyBehavior(FlyBehavior fly){
        this.flyBehavior = fly;
    }
    public void setQuackBehavior(QuackBehavior quack){
        this.quackBehavior = quack;
    }

}
