package day9.test4;

public class Test4 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Apple a1 = new Apple(5, "青色");
        Apple a2 = new Apple(3, "红色");

        System.out.println("默认挑大的：");
        Apple result = worker.pickApple(new Compare(), a1, a2);
        System.out.println(result.getSize() + "-" + result.getColor());

        System.out.println("挑红的：");
        result = worker.pickApple(new CompareAble() {
            @Override
            public Apple compare(Apple a, Apple b) {
                if("红色".equals(a.getColor())) {
                    return a;
                } else {
                    return b;
                }
            }
        }, a1, a2);
        System.out.println(result.getSize() + "-" + result.getColor());

    }
}
