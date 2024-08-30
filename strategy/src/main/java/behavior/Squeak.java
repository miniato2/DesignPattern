package behavior;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑삑 소리를 냅니다.");
    }
}
