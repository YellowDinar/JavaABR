/**
 * Created by ma on 18.04.14.
 */
public class Student {
    private String name;
    private int score;

    public Student(String name){
        this.name = name;
    }

    public void passExam(int b){
        score = b;
        System.out.println("Exam is passed with " + b);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
