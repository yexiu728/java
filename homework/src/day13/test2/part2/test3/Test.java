package day13.test2.part2.test3;

public class Test {

    public static void main(String[] args) {
        try {
            login("admin1", "123456");
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

    public static void login(String name, String pwd) throws LoginException {
        if(! "admin".equals(name)) {
            throw new LoginException("用户名不存在");
        }
        if(! "123456".equals(pwd)) {
            throw new LoginException("密码错误");
        }
        System.out.println("欢迎 " + name);
    }
}
