package behavior;

public class Fly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("오리가 날아갑니다.");
    }
}
