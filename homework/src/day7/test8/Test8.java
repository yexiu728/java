package day7.test8;

public class Test8 {
    public static void main(String[] args) {
        // 讲师
        Lecturer lecturer = new Lecturer("666", "傅红雪");
        lecturer.work();

        // 助教
        Tutor tutor = new Tutor("668", "顾棋");
        tutor.work();

        // 维护专员
        Maintainer maintainer = new Maintainer("686", "庖丁");
        maintainer.work();

        // 采购专员
        Buyer buyer = new Buyer("888", "景甜");
        buyer.work();

    }
}
