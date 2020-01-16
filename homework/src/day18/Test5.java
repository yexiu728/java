package day18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test5 {
    public static void main(String[] args) {
        String data = "我爱Java";
        String path = "D:\\codeData\\a.txt";

        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(path), "GBK")) {

            osw.write(data);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
