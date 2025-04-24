package loopAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class exercise {
    static Scanner scanner = new Scanner(System.in);
    static class Book{
        private String title;
        private String author;
        private int page;

        public Book (String title, String author, int page) {
            this.title = title;
            this.author = author;
            this.page = page;
        }
    }

    public static void main(String[] args) {
//        #1
//        int [] numbers = {3,5,6,34,23};
//        for (int num : numbers){
//            System.out.println(num);

//        #2
//        int num2 = numbers.length-1;
//        while(num2>=0){
//            System.out.println(numbers[num2]);
//        num--;
//        }

//        #3
//        String[] names =  {"Alice", "Bob", "Charlie"};
//
//        int num3 = 0;
//        while (num3 < names.length){
//            System.out.println("Hello " + names[num3] + "! " );
//            num ++;
//        }
        // do while
//       int num4 = 0;
//        do {
//            System.out.println("Hello " + names[num4] + "! " );
//            num4 ++;
//        } while(num4 < names.length);

//        #4
//        int[] number= {3, 5, 7, 2, 8};
//        int sum = 0;
//        for (int num : number){
//            sum += num;
//        }
//        System.out.println(sum);

        //#5
//        int [] numbers2 = {4, 7, 10, 15, 18};
//        for(int num : numbers2){
//            if(num % 2 == 0){
//                System.out.println(num);
//            }

//        //#6
//        int[] numArray = {1, 3, 5, 7, 9};
//        for (int num : numArray){
//            if(  num <= numArray.length && num != 7 ){
//                System.out.println(num);
//            }
//        }
//        int num5 = 0;
//        while (num5 < numArray.length && numArray[num5] != 7){
//            System.out.println(numArray[num5]);
//            num5 ++;
//        }

//        #7
//        String password;
//        do {
//            System.out.println("please enter a password");
//             password = scanner.nextLine();
//        }while (!password.equals("secret123"));

//        #8
//        String[] values =  {"Java", "Python", "Java", "C#", "Java"};
//        int count = 0;
//        for (int i = 0; i < values.length; i++ ){
//            if (values[i].equalsIgnoreCase("java")){
//                count+= 1;
//            }
//        }
//        System.out.println("java appears " + count + " times");

        //#9
//        int[] numbers = {12, 5, 90, 34, 7};
//        int max = numbers [0];
//        for (int i = 1; i < numbers.length; i++){
//            if (numbers[i] > max){
//                max = numbers[i];
//            }
//        }
//        System.out.println(max);

        //#10
//        int[] arrays = {1, 2, 3};
//        int[] arrays2 = {1, 2, 4};
//
//
//
//            for(int i =0 ; i < arrays.length;i++){
//                boolean isEqual = false;
//                if (arrays[i] == arrays2[i]){
//                isEqual = true;}
//
//                System.out.println(isEqual);
//            }

        //#11
//        int[] a = {1, 2, 3, 4};
//        int[] b = new int[a.length];
//
//        for (int i = 0; i < a.length; i++){
//            b[i] = a[i];
//        }
//        System.out.println(Arrays.toString(b));

        //#12
//       int[] Input = {10, 20, 30};
//
//       for ( int i =Input.length-1; i >= 0;i--){
//           System.out.println(Input[i]);
//       }





//                if (num == nam){
//                    System.out.println(true);
//                }else {
//                    System.out.println(false);
//                }

        //#13
//        Book book1 = new Book("java","john");
//        Book book2 = new Book("java","john");
//        Book book3 = new Book("java","john");
//
//
//        System.out.println("Please enter 3 books title and author");
//        System.out.println("Please enter book title and author respectively");
//        book1.title = scanner.nextLine();
//        book1.author = scanner.nextLine();
//        String title1 = scanner.nextLine();
//        String author1 = scanner.nextLine();
//        System.out.println("Please enter book 2 title and author respectively");
//        book2.title = scanner.nextLine();
//        book2.author = scanner.nextLine();
//        String title2 = scanner.nextLine();
//        String author2 = scanner.nextLine();
//        System.out.println("Please enter book 3 title and author respectively");
//        book3.title = scanner.nextLine();
//        book3.author = scanner.nextLine();
//        String title3 = scanner.nextLine();
//        String author3 = scanner.nextLine();

//        System.out.println("according to your information " + book1.title + " is written by " +  book1.author);
//        System.out.println("according to your information " + book2.title + " is written by " +  book2.author);
//        System.out.println("according to your information " + book3.title + " is written by " +  book3.author);
//
       //# 13, 14 and 15

        Book[] book1 = new Book[3];

        System.out.println("Please enter 3 books title and author");
        System.out.println("Please enter book title, author and pages respectively");
        book1[0] = new Book(scanner.nextLine(), scanner.next(), scanner.nextInt());
        scanner.nextLine();
        System.out.println("Please enter book2 title, author and pages respectively");
        book1[1] = new Book(scanner.nextLine(), scanner.next(), scanner.nextInt());
        scanner.nextLine();
        System.out.println("Please enter book3 title, author and pages respectively");
        book1[2] = new Book(scanner.nextLine(), scanner.next(), scanner.nextInt());


//        for (int i = 0; i < book1.length; i++){
//            System.out.println("The " + (i + 1) + "st book is " + book1[i].title);
//        }
        //#14
//        int count = 0;
//        for (int i = 0; i < book1.length; i++){
//            if (book1[i].author.equalsIgnoreCase("alice")){
//                count += 1;
//            }
//        }
//        System.out.println("alice is occurred " + count + " times");

        //#15
        for (int i = 0; i < book1.length; i++){
            if (book1[i].page > 300){
                System.out.println("booom !" + book1[i].title + " has over 300 hundred pages!");
            } else{
                System.out.println(book1[i].title + " has under 300 hundred pages");
            }
        }
        
    }

}
