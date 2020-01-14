package day9.test5;

public class Test5 {
    public static void main(String[] args) {
        Player p1 = new Player();
        FightAble fight1 = p1.select("法力角色");
        fight1.specialFight();
        fight1.commonFight();

        System.out.println("==========");

        Player p2 = new Player();
        FightAble fight2 = p2.select("武力角色");
        fight2.specialFight();
        fight2.commonFight();
    }
}
