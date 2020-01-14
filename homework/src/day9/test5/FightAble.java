package day9.test5;

public interface FightAble {
    public abstract void specialFight();

    public default void commonFight() {
        System.out.println("普通打击");
    }

}
