import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrade studentGrade = new StudentGrade();
        GradeCalculator calculator = new GradeCalculator();
        boolean moreInput = true;

        System.out.println("Enter student grades. Type 'done' when finished.");
        while(moreInput){
            System.out.print("Enter grade (1-100) or type 'done': ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("done"))
                moreInput = false;

            try{
                double grades = Double.parseDouble(input);
                studentGrade.addGrades(grades);
            }catch (NumberFormatException ex){
                System.out.println("Enter only numbers or type 'done'.");
            }
            catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
        ArrayList<Double> grades = studentGrade.getGrades();
        if(!grades.isEmpty()){
            double average = calculator.calculateAverage(grades);
            double highest = calculator.calculateHighest(grades);
            double lowest = calculator.calculateLowest(grades);

            System.out.println("The average marks is: " + average);
            System.out.println("The highest mark is: " + highest);
            System.out.println("The lowest mark is: " + lowest);
        }
    }
}