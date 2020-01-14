package day13.test2.part1.test7;

public class Student {
    private String name;
    private int score;

    public Student() {
    }

    public Student(String name, int score) {
        setName(name);
        setScore(score);
    }

    public void setScore(int score) {
        if(score < 0) {
            throw new NoScoreExcetion("分数不能为负数");
        }

        this.score = score;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

}
