import java.util.Scanner;
public class HeadTailGenerator {

    public static void main (String []args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("How many games do you want to play?: ");
        int games = scanner.nextInt();
        System.out.println("Games: "+games);
        scanner.nextLine();

        double heads=0;
        double score =0.0;

        for (int i=1; i <= games; i++){
            System.out.print("Enter your coin flips for Game "+ i+": ");
            String input = scanner.nextLine();
            String [] inputArray = input.split("\\s+");

            for (int j = 0; j <=inputArray.length-1; j++){
                if (inputArray[j].equals("H") || inputArray[j].equals("h")){
                    heads++;
                }
            }
            score = (heads/inputArray.length)*100;

            if (score >= 50.0){
                System.out.println("Game "+ i+": "+(int)heads+" heads ("+score+"%); You win!");
            }

            else {
                System.out.println("Game "+ i+": "+(int)heads+" heads ("+score+"%); You lose!");

            }
            heads=0;


        }


    }


}//done










