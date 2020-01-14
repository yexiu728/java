package day10.hw3;

public class GouWuChe {
    private String name;
    private double price;
    private int num;
    private double money;

    public GouWuChe() {
    }

    public GouWuChe(String name, double price, int num, double money) {
        this.name = name;
        this.price = price;
        this.num = num;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
