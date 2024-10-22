import java.util.ArrayList;

public class GradeCalculator {
    public double calculateAverage(ArrayList<Double> grades){
        if(grades.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (var grade : grades){
            sum += grade;
        }
        return  sum / grades.size();
    }

    public double calculateHighest(ArrayList<Double> grades){
        if(grades.isEmpty()){
            return  0;
        }
        double highest = grades.get(0);
        for(double grade : grades){
            if(grade > highest)
                highest = grade;
        }
        return highest;
    }

    public double calculateLowest(ArrayList<Double> grades){
        if(grades.isEmpty())
            return 0;
        double lowest = grades.get(0);
        for(double grade : grades){
            if(grade < lowest)
                lowest = grade;
        }
        return lowest;
    }
}
