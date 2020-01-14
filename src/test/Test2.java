package test;

public class Test2 {
    public static void main(String[] args) {
        invokeCook("酸菜鱼", (String food) -> {
            System.out.println("煮了" + food + ", 现在可以开吃了");
        });

        invokeCook("鸡腿堡", new Cook() {
            @Override
            public void eat(String food) {
                System.out.println("这个饭店还提供了" + food + ", 您需要吗？");
            }
        });
    }

    private static void invokeCook(String food, Cook cook){
        cook.eat(food);
    }

}

@FunctionalInterface
interface Cook {
    void eat(String food);
}
