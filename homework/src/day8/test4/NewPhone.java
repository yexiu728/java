package day8.test4;

public class NewPhone implements Play {
    public void call() {
        System.out.println("新手机打电话");
    }

    public void sendMessage() {
        System.out.println("新手机发短信");
    }

    @Override
    public void playGame() {
        System.out.println("新手机玩游戏");
    }
}
