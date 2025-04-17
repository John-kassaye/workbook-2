import java.time.LocalDate;
import java.util.Scanner;

public class TheaterReservations {
    static Scanner ticket = new Scanner(System.in);
    public static void main(String[] args) {
        getUserInfo();
    }
    public static void getUserInfo(){
        String fullName = "";
        System.out.println("Enter ur full name");
        String name = ticket.nextLine().trim();
        String [] name2 = name.split(" ");
        String firstName = name2[0];
        String lastName = name2[name2.length-1];
        fullName = (lastName + ", " + firstName);

        System.out.println("For when(yyyy-mm-dd) ");
        String date = ticket.nextLine().trim();
        LocalDate dateOfTime = LocalDate.parse(date);

        System.out.println("How many tickets do you want?");
        int num = ticket.nextInt();
        if(num == 1){
            System.out.printf("%d ticket reserved for %s under %s", num, dateOfTime, fullName);
        }else {
            System.out.printf("%d tickets reserved for %s under %s", num, dateOfTime, fullName);
        }
    }
}
