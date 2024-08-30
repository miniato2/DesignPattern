package behavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("소리가 나지 않습니다.");
    }
}
