package behavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("오리가 꽥꽥소리를 냅니다");
    }
}
