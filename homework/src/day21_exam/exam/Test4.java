package day21_exam.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*

4、D盘中的test文件夹下有个a.txt文件，把它复制到D盘的test2文件夹中,文件名以时间戳为前缀，例
如：201901011830000abc.txt

*/
public class Test4 {
    public static void main(String[] args) {
        String path = "D:\\test\\a.txt";
        String pathTo = "D:\\test2";

        File file = new File(path);
        File fileTo = new File(pathTo);

        // 如果源文件不存在，则提示并退出
        if (!file.exists()) {
            System.out.println("源文件：" + file.getAbsolutePath() + " 不存在");
            return;
        }
        // 如果目标文件夹不存在，则创建
        if (!fileTo.exists()) {
            boolean b = fileTo.mkdirs();
            System.out.println("目标文件夹：" + fileTo.getAbsolutePath() + "不存在，创建结果：" + b);
            // 如果创建失败，则退出
            if (!b) {
                return;
            }
        }

        // 获得文件名字
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmSSS");
        Date date = new Date();
        String time = sdf.format(date);
        String fileName = fileTo.getAbsolutePath() + "\\" + time + "abc.txt";

        // 复制文件
        try (FileInputStream fis = new FileInputStream(file);
             FileOutputStream fos = new FileOutputStream(fileName)
        ) {

            byte[] b = new byte[1024];
            int len = 0;
            while ((len = fis.read(b)) != -1) {
                fos.write(b, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
            // 遇到异常则终止程序
            return;
        }
        // 完成提示
        System.out.println("复制文件" + file.getAbsolutePath() + "完成");
    }
}
