import java.util.Scanner;

public class CollegeAdmit {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("University admission program!");
        System.out.println("What is your GPA?");
        double GPA = scanner.nextDouble();
        System.out.println("What is your SAT score?");
        int SAT = scanner.nextInt();

        if (GPA > 1.8 && SAT > 900 ){

            System.out.println("You've been accepted!");
        }
        else {

            System.out.println("You've been rejected.");
        }

    }

} //done
