import java.util.Scanner;
public class HeadTailGenerator {

    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many games?");
        int games = scanner.nextInt();
        int count = 0;
        int heads =0;

        while (count<games){
            System.out.print("Enter your flips for game "+ count+": ");
            String input = scanner.nextLine();
            String [] inputArray = input.split("\\s+");
            //System.out.println(inputArray.length);
            for (int i = 0; i <inputArray.length-1; i++){

                if (inputArray[i].equals("H")){
                    heads++;
                }

            }//exit for loop

            double score = (heads/(inputArray.length)*100);

            if (score >= 50.0){

                System.out.println("Game "+ count + ": "+ heads + " heads ("+ score+ "%); You win!");
            }

            else {

                System.out.println("Game "+ count + ": "+ heads + " heads ("+ score+ "%); You lose!");


            }

            count++;
        }
    }
}










