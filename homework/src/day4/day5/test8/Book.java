package day4.day5.test8;

public class Book {
    private String no;
    private String name;
    private String isbn;
    private double price;
    private String date;

    public Book() {
    }

    public Book(String no, String name, String isbn, double price, String date) {
        this.no = no;
        this.name = name;
        this.isbn = isbn;
        this.price = price;
        this.date = date;
    }

    public void showBook() {
        System.out.println(this.no + ", " + this.name + ", " + this.isbn + ", " + this.price + ", " + this.date);
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
