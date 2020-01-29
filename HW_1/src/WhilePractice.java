import java.util.Scanner;
public class WhilePractice {

    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int times = 5;
        int count = 0;

        while (count<times){

            System.out.println("What is your name?");
            String name = scanner.nextLine();
            System.out.println("Nice to meet you, "+ name);

            count++;


        }
    }


}
