package day15.test1;

public class Seller {

    private Ticket t;

    public Seller() {
    }

    public Seller(Ticket t) {
        this.t = t;
    }

    public boolean sell() {
        synchronized (t) {
            if(t.getNum() <= 0) {
                System.out.println(Thread.currentThread().getName() + " 没有票了");
                return false;
            }
            System.out.println(Thread.currentThread().getName() + " 卖了一张票: " + t.getNum());
            t.setNum(t.getNum() - 1);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return true;
        }
    }

    public Ticket getT() {
        return t;
    }

    public void setT(Ticket t) {
        this.t = t;
    }
}
