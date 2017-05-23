package diceexam;
/**
 *
 * @author katherine
 */
public class Dice {
    public int die1; // face
    public int die2;
    public int die3;
    public int user_Guess;
    public int user_secondGuess;
    int dices = die1 + die2 + die3;
    
    public Dice(){}
    
    public void SetDices(int n){
        if (n>=2)
            die1 = n;
            die2 = n;
            die3 = n;
        //else  
                die1 = 6;
                die2 = 6;
                die3 = 6;
    }
    public void Roll(){
        die1 = 1 + (int)(Math.random()*6);
        die2 = 2 + (int)(Math.random()*(12));
        die3 = 3 + (int)(Math.random()*(18));
    }
    
    public Dice(int val1, int val2, int val3)
    {
        die1 = val1;
        //die2 = val2;
        die3 = val3;
        
        val1 = die2;
    }
    
    public int SetDices(){
        if(user_Guess == 1){
            System.out.println(" Die1 is: " + die1);
            return die1;
        }
        if(user_Guess == 2){
            System.out.println(" Die2 is: " + die2);
            return die2;
        }
        if(user_Guess == 3){
            System.out.println(" Die3 is " + die3);
        }   return die3;
    }
    
    public int Value(){ 
        if(user_secondGuess == 1){
            return die1;
        }
        if (user_secondGuess == 2){
            return die2;
        }
        if (user_secondGuess == 3){
            return die3;
        }      
    return user_secondGuess;
    }
    
    @Override public String toString(){    // method named history and printing list of all dice guesses and dice numer 
       String result = Integer.toString(dices);
       return result;
     }
    
}
