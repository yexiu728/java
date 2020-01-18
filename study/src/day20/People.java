package day20;

class People {
    private String name;
    private int age;

    public People() {
    }

    private People(String name) {
        this.name = name;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat() {
        System.out.println("public void eat");
    }

    private void sleep() {
        System.out.println("private void sleep");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
