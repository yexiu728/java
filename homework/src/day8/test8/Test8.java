package day8.test8;

public class Test8 {
    public static void main(String[] args) {
        GouWuChe gouWuChe = new GouWuChe();

        Laptop laptop = new Laptop("g10000", "笔记本", 10000);
        Phone phone = new Phone("g10001", "手机", 5000);
        Fruit fruit = new Fruit("g20000", "苹果", 50);

        System.out.println("========== 添加商品 ==========");
        gouWuChe.addGoods(laptop);
        gouWuChe.addGoods(phone);
        gouWuChe.addGoods(fruit);

        System.out.println("========== 打印商品 ==========");
        gouWuChe.showGoods();

        System.out.println("--------------------");
        gouWuChe.total();

    }
}
