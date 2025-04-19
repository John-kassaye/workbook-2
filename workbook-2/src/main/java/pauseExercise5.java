import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class pauseExercise5 {
    static Scanner pause6 = new Scanner(System.in);
    public static void main(String[] args) {
        DateTimeFormatter formatter = null;

        System.out.println("Enter your date (in ISO format: yyyy-MM-dd)");
        String date = pause6.nextLine();
        System.out.println("1: dd-MM-yyyy");
        System.out.println("2: MMM-dd-yy");
        System.out.println("3: yyyy-dd-MMMM");
        String choice = pause6.nextLine();


        if(choice.equals("1")){
            formatter  = DateTimeFormatter.ofPattern("dd-MM-yyyy");}
        else if (choice.equals("2")) {
          formatter = DateTimeFormatter.ofPattern("MMM-dd-yy");
        } else if (choice.equals("3")) {
            formatter = DateTimeFormatter.ofPattern("yyyy-dd-MMM");
        }
        LocalDate kkk= LocalDate.parse(date);
        String formattedDate = kkk.format(formatter);
        System.out.println(formattedDate);

    }
}
