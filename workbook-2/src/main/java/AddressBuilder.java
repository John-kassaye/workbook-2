import java.util.Scanner;

public class AddressBuilder {
   static Scanner address = new Scanner(System.in);
    public static void main(String[] args) {
        StringBuilder john = new StringBuilder();
        System.out.println("Enter ur full name");
        john.append(address.nextLine()).append("\n\n");
        System.out.println("Enter ur billing street");
        john.append("Billing Address:\n").append(address.nextLine()).append("\n");
        System.out.println("Enter ur billing city");
        john.append(address.nextLine()).append(",").append(" ");
        System.out.println("Enter ur billing state");
        john.append(address.nextLine()).append(" ");
        System.out.println("Enter ur billing zip");
        john.append(address.nextLine()).append("\n\n");
        System.out.println("Enter ur shipping street");
        john.append("Shipping Address:\n").append(address.nextLine()).append("\n");
        System.out.println("Enter ur shipping city");
        john.append(address.nextLine()).append(",").append(" ");
        System.out.println("Enter ur shipping state");
        john.append(address.nextLine()).append(" ");
        System.out.println("Enter ur shipping zip");
        john.append(address.nextLine());

        System.out.println(john.toString());

    }
}
