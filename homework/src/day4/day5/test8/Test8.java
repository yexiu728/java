package day4.day5.test8;

public class Test8 {
    public static void main(String[] args) {
        Book b1 = new Book("No0001", "天下第一书", "isbn123456789", 30, "1949-10-12");
        Book b2 = new Book("No0002", "辟邪剑法", "isbn12121212", 45.5, "1997-10-01");
        Book b3 = new Book("No0003", "JavaWeb实战", "isbn38768797524", 58.8, "2017-01-01");

        Book[] books = {b1, b2, b3};

        Book expensive = books[0];

        for(int i = 1; i < books.length; i++) {
            if(books[i].getPrice() > expensive.getPrice()) {
                expensive = books[i];
            }
        }

        System.out.print("最贵的书是: ");
        expensive.showBook();
    }
}
