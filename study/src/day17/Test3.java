package day17;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        Properties p = new Properties();

        try(FileReader fr = new FileReader("study\\src\\day17\\data")) {

            p.load(fr);

            Set<String> set = p.stringPropertyNames();
            set.stream().forEach(key -> {
                System.out.println(key + ":" + p.getProperty(key));
            });

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
