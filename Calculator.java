package calculator;

/**
 * @author ksarabia
 */

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        
        int xx;    
        int yy;    
        int sum;
        int difference;
        int product;
        int quotient; 
        
        System.out.print("Enter first number:");    
        xx = input.nextInt();        
        System.out.print("Enter second number:");    
        yy = input.nextInt();        
          
        sum = xx + yy;
        difference = xx - yy;
        product = xx * yy;
        quotient = xx / yy; 
        
        System.out.printf("\nHello, you entered %d and %d", xx, yy);    
        System.out.printf("\nThe sum is: %d",sum);  
        System.out.printf("\nThe difference is: %d",difference);
        System.out.printf("\nThe product is: %d",product);
        System.out.printf("\nThe quotient is: %d\n",quotient);
    }
    
}
