package day5;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        Worker w1 = new Worker("bz001", "黄渤", 45);
        Worker w2 = new Worker("bz002", "孙红雷", 48);
        Worker w3 = new Worker("bz003", "罗志祥", 35);

        ArrayList<Worker> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);

        findMaxAge(list);
    }

    public static void findMaxAge(ArrayList<Worker> workers) {

        System.out.println("最高年龄worker对象：");

        Worker maxAgeWorker = workers.get(0);

        for (int i = 1; i < workers.size(); i++) {
            if(workers.get(i).getAge() > maxAgeWorker.getAge()) {
                maxAgeWorker = workers.get(i);
            }
        }

        maxAgeWorker.show();
    }
}
