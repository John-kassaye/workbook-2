import java.util.Scanner;

public class FullNameApplication {
    static Scanner string = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(firstName());
    }
    public static String firstName() {
        System.out.println("Please enter your first name");
        String name = string.nextLine();
        System.out.println("do you have a second name (y/n)");
        String hasName = string.nextLine();
        if(hasName.equals("y")){
            System.out.println("What is your middle name");
            name += " " + string.nextLine();
        }
        System.out.println("Please enter your last name");
        name += " " + string.nextLine();
        System.out.println("Do you have a suffix(y/n)");
        String suffix = string.nextLine();
        if (suffix.equals("y")){
            System.out.println("Please enter your suffix");
            name += ", " + string.nextLine();
        }
        return name;

    }
    public static void fullName (){
        System.out.println("Please enter your full name");
        String fullName = string.nextLine();

    }


}
