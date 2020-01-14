package day13.test2.part1;

public class Test6 {
    public static void main(String[] args) throws Exception {
        // testThrow();
        testTryCatch();
    }

    public static void testTryCatch() {
        try {
            charAt("", 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testThrow() throws Exception {
        charAt("hello", 5);
    }

    public static char charAt(String str, int index) throws Exception {
        if (str == null) {
            throw new Exception("字符串不能为null");
        } else if ("".equals(str)) {
            throw new Exception("字符串不能为空");
        }
        if (index < 0 || index >= str.length()) {
            throw new Exception("索引越界");
        }

        return str.charAt(index);


    }
}
