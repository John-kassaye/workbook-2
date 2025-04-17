import java.util.Scanner;

public class pauseExercise4 {
    static Scanner pause5 = new Scanner(System.in);

    public static void main(String[] args) {

        // very easy way

        //ask for direction
//        String want = "";
//        do{ System.out.println("choose a direction: 1:Celsius - Fahrenheit or 2:Fahrenheit - Celsius.");
//        int direction = pause5.nextInt();
//        // ask for temp
//        System.out.println("What is the temp");
//        double temp = pause5.nextDouble();
//        //converting
//        double formula = 0;
//        if(direction == 1){
//            formula = ( temp * 9/5) + 32;
//        System.out.printf("here is ur temperature %.1f°F", formula );
//        }else if(direction == 2){
//            formula = ( temp - 32) * 5/9;
//        System.out.printf("here is ur temperature %.1f°C" , formula );
//        } else {
//            System.out.println("Invalid option");
//        }
//
//            System.out.println("\nDo you want to do it again.(y/n)");
//            pause5.nextLine();
//            want = pause5.nextLine();
//
//        } while (want.equals("y"));
//
//        System.out.println("Thank you for using the app!");


        // using methods


        displayTemp();
    }

    public static int asking() {
        // ask for direction
        System.out.println("Please choose a direction: \n 1:Celsius - Fahrenheit\n 2:Fahrenheit - Celsius.\n 3: kelvin - celsius \n 4:kelvin - fahrenheit");
        int direction = pause5.nextInt();
        return direction;
    }

    public static double tem() {
        // ask for temp
        System.out.println("What is the temp");
        double temp = pause5.nextDouble();
        return temp;
    }

    public static double calculation(int direction2, double temp2) {
        double formula = 0;
        if (direction2 == 1) {
            formula = (temp2 * 9 / 5) + 32;
        } else if (direction2 == 2) {
            formula = (temp2 - 32) * 5 / 9;
        } else if(direction2 == 3){
            formula = temp2 - 273.15;
        } else if (direction2 == 4){
            formula = (temp2 - 273.15) * 9/5 + 32;
        }else {
            System.out.println("Invalid option");
        }
        return formula;
    }
    public static void displayTemp(){
       String want = "";

        do {
            int formula2 = asking();
            double temp2 = tem();
            double result = calculation(formula2, temp2);

            if (formula2 == 1) {
                System.out.printf("here is your temperature %.1f°F", result);
            } else if (formula2 == 2) {
                System.out.printf("here is your temperature %.1f°C", result);
            } else if (formula2 == 3) {
                System.out.printf("here is your temperature %.1f°C", result);
            } else if (formula2 == 4) {
                System.out.printf("here is your temperature %.1f°F", result);
            } else {
                System.out.println("Invalid option");
            }

            System.out.println("\nDo you want to do it again.(y/n)");
            pause5.nextLine();
             want = pause5.nextLine();
        } while(want.equalsIgnoreCase("y"));

        System.out.println("Thank you for using the app!");
    }



}
