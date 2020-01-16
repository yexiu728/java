package day18;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test10 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("D:\\codeData\\text.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\codeData\\text1.txt"))
        ) {

            ArrayList<String> list = new ArrayList<>();
            String line = null;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            // 反转集合数据
            Collections.reverse(list);

            for (String s : list) {
                bw.write(s);
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
