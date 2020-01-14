package day9.test5;

public class Player {
    public FightAble select(String str) {
        System.out.println("选择：" + str);

        if("法力角色".equals(str)) {
            return new Magic();
        } else {
            return new Soldier();
        }
    }
}
