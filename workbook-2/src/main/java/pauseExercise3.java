import java.util.Scanner;

public class pauseExercise3 {
    static Scanner pause4 = new Scanner(System.in);
    public static void main(String[] args) {

//        method();
//        method2();
        System.out.println("here is per person cost: " + askingPerson());

    }
    public static double askUser (){
        System.out.println("Enter the total amount");
        return pause4.nextDouble();
    }
    public static double askTip(){
        System.out.println("Enter the desired tip percentage");
        return pause4.nextDouble();
    }
    public static double tipAmount(double x, double y){
       return x * ( y / 100);
    }
    public static double totalBill(double u, double m) {
        return u + m;
    }
    public static int askingPerson(){
        System.out.println("How many person to split the bill");
        int person = pause4.nextInt();
        double userAmount = askUser();
        double tipAmount = askTip();
        double tipAmount2= tipAmount(userAmount,tipAmount);
        double total = totalBill(userAmount,tipAmount2);

        return (int) (total/person);
    }

    public static void method1 (){
        // ask user for amount
        System.out.println("Enter the total amount");
        double amount = pause4.nextDouble();
        //ask for tip
        System.out.println("Enter the desired tip percentage");
        double tip = pause4.nextDouble();
        // calculate tip amount
        double tipAmount = amount * ( tip / 100);
        // calculate total bill
        double totalBill = amount + tipAmount;
        System.out.println("here is your total bill " + Math.ceil(totalBill));
    }
    public static void method2(){
        double userAmount = askUser();
        double tipAmount = askTip();
        double tipAmount2= tipAmount(userAmount,tipAmount);
        double total = totalBill(userAmount,tipAmount2);
        System.out.println("Here is your total bill: " + total);

    }
}
