import java.util.Scanner;

public class HighScoreWins {
    static Scanner highscore = new Scanner(System.in);
    public static void main(String[] args) {

        gameScore();

    }
    public static void gameScore(){

        System.out.println("Enter the game result in this format Home:Visitor|21:9");
        String score = highscore.nextLine();

        // shorter and cleaner way
        String[] parts = score.split("[:|]");

        String team1 = parts[0];
        String team2 = parts[1];
        int score1 = Integer.parseInt(parts[2]);
        int score2 = Integer.parseInt(parts[3]);

        String winner = "";
        if (score1 > score2){
            winner = team1;
        } else if (score1 < score2) {
            winner = team2;
        }else if(score1 == score2) {
            System.out.println("Equal");
        }

        System.out.println("Winner: " + winner);


        // Long way of doing it
//        String[] split1 = score.split("\\|");
//        String scores = split1[1];
//        String team = split1[0];
//
//        String[] splitting = scores.split(":");
//        String score11 = splitting[0];
//        String score22 = splitting[1];
//        String[] splitting2 = team.split(":");
//        String team1 = splitting2[0];
//        String team2 = splitting2[1];
//
//        int homeScore = Integer.parseInt(score11);
//        int homeScore2 = Integer.parseInt(score22);

//        String winner = "";
//        if (homeScore > homeScore2){
//            winner = team1;
//        } else if (homeScore < homeScore2) {
//            winner = team2;
//        }else if(homeScore == homeScore2) {
//            System.out.println("Equal");
//        }
//
//        System.out.println("Winner: " + winner);

    }
}
