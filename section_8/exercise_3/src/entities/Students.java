package entities;

public class Students {

    public double gradeA;
    public double gradeB;
    public double gradeC;
    public String name;

    public double finalGrade(){
        return gradeA + gradeB + gradeC;
    }
    public double missingPoints(){
        if(finalGrade() < 60){
            return 60 - finalGrade();
        } else{
            return 0;
        }
    }
}
