package day16.part2;

import java.io.File;
import java.io.FileFilter;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("study\\src\\day16");
        File[] files = file.listFiles(new MyFilter());

        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
    }
}

class MyFilter implements FileFilter {

    @Override
    public boolean accept(File file) {
        return file.getName().endsWith(".java");
    }
}
