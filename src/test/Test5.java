package test;

import java.io.*;

// 复制粘贴文件
// file: 9833
// buff: 8867

public class Test5 {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        File fileIn = new File("D:\\课件\\java\\02_Oracle【26-30】\\资料\\win64_11gR2_database_1of2.zip");
        File fileOut = new File("src\\test\\images\\copy.zip");

        if (! fileIn.exists()) {
            System.out.println("文件不存在");
            return;
        }

        System.out.println("开始读取文件");

        FileInputStream fis = new FileInputStream(fileIn);
        FileOutputStream fos = new FileOutputStream(fileOut);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int len = 0;
        byte[] bs = new byte[1024];

        while((len = bis.read(bs)) != -1) {
            bos.write(bs, 0, len);
            bos.flush();
        }

        bos.close();
        bis.close();
        fos.close();
        fis.close();

        System.out.println("读取文件结束");

        long end = System.currentTimeMillis();
        System.out.println("用时: " + (end - start));


    }
}
