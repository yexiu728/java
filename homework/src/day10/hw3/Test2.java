package day10.hw3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        ArrayList<ShangPin> sp = new ArrayList<>();
        // 初始化商品列表
        sp.add(new ShangPin("001", "少林核桃", 15.5, "斤"));
        sp.add(new ShangPin("002", "尚康饼干", 14.5, "包"));
        sp.add(new ShangPin("003", "移动硬盘", 345.0, "个"));
        sp.add(new ShangPin("004", "高清无码", 199.0, "G"));

        // 购物车列表
        ArrayList<GouWuChe> gwc = new ArrayList<>();

        System.out.println("\t\t\t\t\t欢迎使用超市购物系统");

        // 输入命令
        Scanner sc = new Scanner(System.in);

        // 使用死循环，因为要重复执行，在输入3 的时候退出循环，结束购物
        while (true) {
            System.out.println("请输入您要进行的操作：");
            System.out.println("1:购买商品      2:结算并打印小票      3:退出系统");

            // 输入命令
            int command = sc.nextInt();

            // 购买商品
            if (command == 1) {
                // 打印商品信息
                System.out.println("----------------------------------------");
                System.out.println("\t\t\t\t\t商品列表");
                System.out.println("商品id\t\t名称\t\t单价\t\t计价单位");
                for (int i = 0; i < sp.size(); i++) {
                    ShangPin s = sp.get(i);
                    System.out.println(s.getId() + "\t\t" + s.getName() + "\t\t" + s.getPrice() + "\t\t" + s.getUnit());
                }
                System.out.println("----------------------------------------");

                System.out.println("请输入您要购买的商品项(输入格式: 商品id-购买数量)，输入end表示购买结束。");

                // 购买商品
                while (true) {
                    // 用户输入
                    String str = sc.next();
                    String[] id = str.split("-");

                    // 退出
                    if ("end".equals(str)) {
                        break;
                    } else if (id.length != 2) {
                        // 判断输入是否符合要求
                        System.out.println("您输入的购买姿势不对，请换个姿势再来一次(格式: 商品id-购买数量)");
                    } else {
                        // 判断商品是否存在，并存储商品索引
                        int exist = -1;
                        for (int i = 0; i < sp.size(); i++) {
                            ShangPin s = sp.get(i);
                            if (s.getId().equals(id[0])) {
                                exist = i;
                                break;
                            }
                        }
                        if (exist != -1) {
                            // 商品存在，购买商品
                            ShangPin s = sp.get(exist);
                            double money = s.getPrice() * Integer.parseInt(id[1]); // 此次加入购物车的商品的总价
                            GouWuChe gw = new GouWuChe(s.getName(), s.getPrice(), Integer.parseInt(id[1]), money);
                            // 添加商品到购物车
                            gwc.add(gw);
                        } else {
                            // 该商品不存在
                            System.out.println("您输入的商品id 不存在，请重新输入！！");
                        }

                    }
                }
                System.out.println("----------------------------------------");

                // 结算
            } else if (command == 2) {
                // 总价
                double money = 0;
                // 总数量
                int count = 0;

                System.out.println("----------------------------------------");
                System.out.println("\t\t\t\t\t欢迎光临");
                System.out.println("名称\t\t\t售价\t\t\t数量\t\t\t金额");
                System.out.println("----------------------------------------");
                for (int i = 0; i < gwc.size(); i++) {
                    GouWuChe gw = gwc.get(i);
                    System.out.println(gw.getName() + "\t\t" + gw.getPrice() + "\t\t" + gw.getNum() + "\t\t" + gw.getMoney());
                    money += gw.getMoney();
                    count += gw.getNum();
                }
                System.out.println("----------------------------------------");
                System.out.println(gwc.size() + " 项商品");
                System.out.println("共计：" + count + " 件");
                System.out.println("共：" + money + " 元");
                System.out.println("----------------------------------------");

                // 退出
            } else if (command == 3) {
                System.out.println("----------------------------------------");
                System.out.println("\t\t\t\t\t欢迎再次光临");
                System.out.println("----------------------------------------");
                break;
            }
        }

    }
}
