package diceexam;
/**
 *
 * @author katherine
 */
import java.util.Scanner;
public class DiceExam {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // TODO code application logic here
      
        Dice firstDie = new Dice();
        Dice secondDie = new Dice();
        Dice thirdDie = new Dice();
   
        //int countRolls =0;
        // need boolean 
        //boolean loop = true;
        int Roundsplayed = 1;
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;
        int Replay = 0;
        firstDie.Roll();
        secondDie.Roll();
        thirdDie.Roll();
        String correct = "Your guess is correct! Congrats!\n";
        String incorrect = "Your guess was incorrect. Better Luck next time.\n";
        int[] list_die1= new int[100];
        int[] list_die2= new int[100];
        int[] list_die3= new int[100];
        int[] numbers = new int[100];
        
        for (int i=0; i < numbers.length; i++){
            list_die1[i] = total1;
            list_die2[i] = total2;
            list_die3[i] = total3;
        do
        {
        System.out.println("How many dice do you want to roll? \n");
        System.out.println("Enter 1 for one, 2 for  two, and 3 for three.");
        int user_Guess = scan.nextInt();
        System.out.println("Guess the number the die or dice has rolled.");
        System.out.println("If 1, choose a number between 1-6\nIf 2, choose a number between 2-12\nIf 3, choose a number bwteen 3-18");
        int user_secondGuess = scan.nextInt();
        System.out.println("\nYour guess is " + user_secondGuess);
        
        if (user_Guess == 1)
        { 
        total1 = firstDie.die1;
        System.out.println("Die 1 is " + total1);
        String Answer = (user_secondGuess == total1) ? correct : incorrect;
        System.out.println(Answer);
        }
        if (user_Guess == 2)
        {
        total2 = secondDie.die2;
        System.out.println("Die 2 is " + total2);
        String Answer = (user_secondGuess == total2) ? correct : incorrect;
        System.out.println(Answer);
        }
        if (user_Guess == 3)
        {
        total3 = thirdDie.die3;
        System.out.println("Die 3 is " + total3);
        String Answer = (user_secondGuess == total3) ? correct : incorrect;
        System.out.println(Answer);        
        } 
        
        System.out.printf("You have played %d rounds.\n", Roundsplayed); Roundsplayed++;
            System.out.println("Do you want to play again?\nPress 1 to Continue or 0 to Quit. ");
            Replay = scan.nextInt();
            i++;
        }       
        while(Replay > 0);
        scan.close();
        System.out.printf("Game history is:%n");

        System.out.printf("Die number  ");

        int totalGamesPlayed = 0;

        for(int row=0; row<totalGamesPlayed;row++)
        {
        System.out.printf(" Game %d", row +1);
        System.out.printf("%d",list_die1[row]);
        System.out.println();
        }
        i=0;
        }
    }    
}
