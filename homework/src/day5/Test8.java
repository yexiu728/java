package day5;

import java.util.ArrayList;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();

        /*list.add(new Book("Java入门到精通", 99.9));
        list.add(new Book("PHP入门到精通", 33.3));
        list.add(new Book("python入门到放弃", 88.8));*/

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("请录入第" + (i + 1) + " 本书的名称：");
            String title = scan.next();
            System.out.print("请录入第" + (i + 1) + " 本书的价格：");
            double price = scan.nextDouble();

            Book book = new Book(title, price);
            list.add(book);
        }

        printBook(list);

        System.out.println("===== 最贵的书 =====");
        Book expensive = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i).getPrice() > expensive.getPrice()) {
                expensive = list.get(i);
            }
        }
        expensive.show();

        System.out.println("===== 价格从高到低排序 =====");
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size() - i - 1; j++) {
                if(list.get(j).getPrice() < list.get(j + 1).getPrice()) {
                    Book temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        printBook(list);

    }

    // 打印list
    public static void printBook(ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            books.get(i).show();
        }
    }
}
