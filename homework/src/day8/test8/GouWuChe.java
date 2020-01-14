package day8.test8;

import java.util.ArrayList;

public class GouWuChe {
    ArrayList<Goods> list = new ArrayList<>();

    public GouWuChe() {
    }

    // 添加商品
    public void addGoods(Goods goods) {
        list.add(goods);
        System.out.println("加入 " + goods.getName() + " 成功");
    }

    // 展示购物车
    public void showGoods() {
        System.out.println("您选购的商品为：");
        for (int i = 0; i < list.size(); i++) {
            Goods g = list.get(i);
            System.out.println("    " + g.getId() + ", " + g.getName() + ", " + g.getPrice());
        }
    }

    // 计算总价和折后价
    public void total() {
        double money = 0d;
        double discount = 0d;

        for (int i = 0; i < list.size(); i++) {
            Goods g = list.get(i);
            double m = g.getPrice();
            money += m;

            if(g instanceof EGoods) {
                m *= 0.88;
            }
            discount += m;
        }

        System.out.println("原   价为：" + money + " 元");
        System.out.println("折后价为：" + discount + " 元");
    }

}
