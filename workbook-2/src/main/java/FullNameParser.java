import java.util.Scanner;

public class FullNameParser {
    static Scanner fullnames = new Scanner(System.in);
    public static void main(String[] args) {

        setFullName();
    }
    public static void setFullName(){
        System.out.println("Please enter your full name");
        String name = fullnames.nextLine().trim();
        String[] name2 = name.split("\\s+");

        String firstName = name2[0];
        String secondName = "none";
        String lastName;

        if (name2.length == 2){
             lastName = name2[1];
        }else {
            secondName = name2[1];
            lastName = name2[2];
        }
        System.out.println("Your first name is " + firstName);
        System.out.println("Your second name is " + secondName);
        System.out.println("Your last name is " + lastName);

    }

}
