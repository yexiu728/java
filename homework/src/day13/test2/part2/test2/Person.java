package day13.test2.part2.test2;

public class Person {
    private String name;
    private int lifeValue;

    public Person() {
    }

    public Person(String name, int lifeValue) {
        setName(name);
        setLifeValue(lifeValue);
    }

    public void setLifeValue(int lifeValue) {
        if(lifeValue < 0) {
            throw new NoLifeValueException("生命值不能为负数");
        }
        this.lifeValue = lifeValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }
}
