package day18;

import java.io.*;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        String path = "D:\\codeData\\data.txt";
        Scanner scan = new Scanner(System.in);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            BufferedReader br = new BufferedReader(new FileReader(path))
        ) {

            for (int i = 0; i < 3; i++) {
                System.out.println("请录入第 " + (i + 1) + " 个验证码：");
                bw.write(scan.nextLine().trim() + "\r\n");
                bw.flush();
            }

            System.out.println("录入成功，请输入需要校验的验证码：");
            String code = scan.nextLine().trim();

            String line = "";
            boolean flag = false;
            while ((line = br.readLine()) != null) {
                if (line.equals(code)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("验证成功！！！");
            } else {
                System.out.println("验证失败");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
