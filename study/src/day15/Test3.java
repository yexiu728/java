package day15;

public class Test3 {
    public static void main(String[] args) {
        Show show = new Show();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        show.show1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        show.show2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        show.show3();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}

class Show {

    int count = 0;

    public void show1() throws InterruptedException {
        synchronized (Object.class) {
            while(count != 0) {
                Object.class.wait();
            }
            System.out.print("犯");
            System.out.print("我");
            System.out.print("中");
            System.out.print("华");
            System.out.print("者");
            System.out.println();
            count = 1;
            Object.class.notifyAll();

        }
    }

    public void show2() throws InterruptedException {
        synchronized (Object.class) {
            while(count != 1) {
                Object.class.wait();
            }
            System.out.print("虽");
            System.out.print("远");
            System.out.print("必");
            System.out.print("诛");
            System.out.println();
            count = 2;
            Object.class.notifyAll();
        }
    }

    public void show3() throws InterruptedException {
        synchronized (Object.class) {
            while(count != 2) {
                Object.class.wait();
            }
            System.out.print("我");
            System.out.print("是");
            System.out.print("中");
            System.out.print("国");
            System.out.print("人");
            System.out.println();
            count = 0;
            Object.class.notifyAll();
        }
    }
}
