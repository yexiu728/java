package day7.test8;

// 助教
public class Tutor extends Teacher {

    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 " + getId() + " 助教 " + getName() + " 在帮助学生解决问题");
    }
}
