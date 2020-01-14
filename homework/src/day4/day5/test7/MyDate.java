package day4.day5.test7;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void showDate() {
        System.out.println("日期: " + this.year + "年" + this.month + "月" + this.day + "日");
    }

    public void isBi() {
        boolean flag = false;
        if(this.year % 100 != 0 && this.year % 4 == 0) {
            flag = true;
        }
        if(this.year % 100 == 0 && this.year % 400 == 0) {
            flag = true;
        }
        System.out.println(this.year + "年" + (flag ? "是" : "不是") + "闰年");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
