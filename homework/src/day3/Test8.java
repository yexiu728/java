package day3;

public class Test8 {
    public static void main(String[] args) {
        for(int i = 1; i <= 12; i++) {
            System.out.print(i + "：");
            String xz = "";
            switch(i) {
                case 1:
                    xz = "水瓶";
                    break;
                case 2:
                    xz = "双鱼";
                    break;
                case 3:
                    xz = "白羊";
                    break;
                case 4:
                    xz = "金牛";
                    break;
                case 5:
                    xz = "双子";
                    break;
                case 6:
                    xz = "巨蟹";
                    break;
                case 7:
                    xz = "狮子";
                    break;
                case 8:
                    xz = "处女";
                    break;
                case 9:
                    xz = "天秤";
                    break;
                case 10:
                    xz = "天蝎";
                    break;
                case 11:
                    xz = "射手";
                    break;
                case 12:
                    xz = "摩羯";
                    break;
            }
            System.out.println(xz);
        }
    }
}
