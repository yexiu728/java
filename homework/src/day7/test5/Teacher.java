package day7.test5;

public class Teacher extends Person {
    private String xueKe;

    public Teacher() {
    }

    public Teacher(String xueKe) {
        this.xueKe = xueKe;
    }

    public void jiangKe() {
        System.out.println(this.getName() + "老师，讲授" + xueKe + "课");
    }

    public String getXueKe() {
        return xueKe;
    }

    public void setXueKe(String xueKe) {
        this.xueKe = xueKe;
    }
}
