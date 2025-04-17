import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class pauseExercise2 {
    static Scanner pause2 = new Scanner(System.in);
    public static void main(String[] args) {

//       asking();
        Scanner pause3 = new Scanner(System.in);
        String userinput = display(pause3);

        int display1 = numOfCharacter(userinput);
        int display2 = numOfWords(userinput);
        char display3 =firstWord(userinput);
        char display4 =lastWord(userinput);

        System.out.println("here is the number of words " + display2);
        System.out.println("here is the number of characters " + display1);
        System.out.println("here is the first character " + display3);
        System.out.println("here is the last character " + display4);

    }
    public static void asking(){
        System.out.println("Enter a sentence");
        String sentence = pause2.nextLine();
        int character = sentence.length();
        System.out.println(character);
        String[] word = sentence.split(" ");
        int words = word.length;
        System.out.println(words);
        char a = sentence.charAt(0);
        char b = sentence.charAt(sentence.length()-1);
        System.out.println("First character is: " +  a);
        System.out.println("Last character is: " +  b);
    }
    public static String display(Scanner pause3){
        System.out.println("Enter a sentence");
        return pause2.nextLine();
    }

   public static int numOfCharacter(String x) {
       return x.length();
    }

    public static int numOfWords(String y){
        String[] word1 = y.split(" ");
        return word1.length;
    }

    public static char firstWord(String z){
       return z.charAt(0);
    }
    public static char lastWord(String l){
        return l.charAt(l.length()-1);
    }


}
