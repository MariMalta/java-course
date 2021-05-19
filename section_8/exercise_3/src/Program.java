import entities.Students;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Students student = new Students();

        System.out.println("Name and grades: ");

        student.name = sc.nextLine();
        student.gradeA = sc.nextDouble();
        student.gradeB = sc.nextDouble();
        student.gradeC = sc.nextDouble();

        System.out.printf("Final grade = %.2f %n",student.finalGrade());

        if(student.finalGrade() > 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", student.missingPoints());
        }
    }
}
s