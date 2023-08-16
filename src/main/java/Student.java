import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {

    private String name;
    private long id;
    private ArrayList<Integer> grades;


    public Student(){

    }

    public Student(String name, long id) {
        this.grades = new ArrayList<>();
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrades(int grade){
        this.grades.add(grade);
    }

    public double getGradesAverage(){
        double sum= 0;
        for(int grade: this.grades){
            sum += grade;
        }
        return sum/ this.grades.size();
    }

}
