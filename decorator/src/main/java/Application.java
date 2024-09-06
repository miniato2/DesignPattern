import coffee.Beverage;
import coffee.DarkRoast;
import coffee.Espresso;
import decorator.Mocha;
import decorator.Whip;

public class Application {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        //래퍼클래스 모카로 감싼다
        beverage2 = new Mocha(beverage2);
        //한번더 감쌀 수 있음
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
