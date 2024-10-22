import java.util.ArrayList;

public class StudentGrade {
    private final ArrayList<Double> grades;

    public StudentGrade(){
        this.grades = new ArrayList<>();
    }

    public void addGrades(double grade){
        if(grade > 100 | grade < 0)
            throw new IllegalArgumentException("Please enter numbers between 0 and 100 only.");
        grades.add(grade);
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }
}
