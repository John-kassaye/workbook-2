import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class pauseExercise1 {
    static Scanner pause = new Scanner(System.in);
    static double num = 0;
    static double num2 = 0;
    static int choice = 0;
    static double result = 0;
    public static void main(String[] args) {

        System.out.println(operation());
        System.out.println(answer(ask(),ask2()));
        System.out.println(askkk());
    }
    // asking user
    public static double operation (){
        System.out.println("enter the first number");
        double firstnum = Double.parseDouble(pause.nextLine());
        System.out.println("enter the second numebr");
        double secondnum = Double.parseDouble(pause.nextLine());
        System.out.println("which operator do you want to use");
        System.out.println("1:+\n2:-\n3:*\n4:/");
        int choice = Integer.parseInt(pause.nextLine());

        double result = 0;
        if (choice == 1){
            result = firstnum + secondnum;
        } else if (choice == 2) {
            result = firstnum - secondnum;
        } else if(choice == 3){
            result = firstnum * secondnum;
        } else if (choice == 4) {
            result = firstnum / secondnum;
        }else{
            System.out.println("Invalid answer");
        }

        return result;
    }


    public static double ask () {
        System.out.println("enter the first number");
        double firstnum = pause.nextDouble();
        return firstnum;
    }public static double ask2(){
        System.out.println("enter the second number");
        double secondnum = pause.nextDouble();
        return secondnum;
    }
    public static double answer (double firstnum, double secondnum ){
        System.out.println("which operator do you want to use");
        System.out.println("1:+\n2:-\n3:*\n4:/");
        int choice = pause.nextInt();

        double result = 0;
        if (choice == 1){
            result = firstnum + secondnum;
        } else if (choice == 2) {
            result = firstnum - secondnum;
        } else if(choice == 3){
            result = firstnum * secondnum;
        } else if (choice == 4) {
            result = firstnum / secondnum;
        }else{
            System.out.println("Invalid answer");
        }

        return result;
    }
    public static double askkk(){
        System.out.println("enter the first num");
        num = pause.nextDouble();
        System.out.println("enter the second num");
        num2 = pause.nextDouble();
        pause.nextLine();
        System.out.println("which operator do you want to use");
        System.out.println("1:+\n2:-\n3:*\n4:/");
        choice = Integer.parseInt(pause.nextLine());

        if (choice == 1){
            result = num + num2;
        } else if (choice == 2) {
            result = num - num2;
        } else if(choice == 3){
            result = num * num2;
        } else if (choice == 4) {
            result = num / num2;
        }else{
            System.out.println("Invalid answer");
        }
        return result;
    }
}
