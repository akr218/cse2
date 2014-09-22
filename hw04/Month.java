//Amanda Ritter
//hw04
//Month Java Program
//
//This program gives the amount of tax collected on a given amount of income
//First compile the program 
    //javac IncomeTax.java
//Then run the program
    //java IncomeTax
    
import java.util.Scanner; //import scanner

public class Month {
    //main method required for every program 
    public static void main(String[] args) { 
        
        //Create a Scanner
        Scanner input = new Scanner(System.in); 
     
    System.out.print(
        "Enter an integer giving the number of the month (1-12): ");
        int InputMonth = 0;
        InputMonth = input.nextInt();
        
    if(InputMonth == 1) {
        System.out.println("This month has 31 days.");
    }
    else if(InputMonth == 2) {
        System.out.print(
            "Enter the year: ");
        int year = input.nextInt();
        if(year % 4 == 0) {
            System.out.println("This month has 28 days.");
        }
        else {
            System.out.println("This month has 29 days.");
        }
        }
    else if(InputMonth == 3) {
        System.out.println("This month has 31 days.");
    }
    else if(InputMonth == 4) {
        System.out.println("This month has 30 days.");
    }
    else if(InputMonth == 5) {
        System.out.println("This month has 31 days.");
    }
    else if(InputMonth == 6) {
        System.out.println("This month has 30 days.");
    }
    else if(InputMonth == 7) {
        System.out.println("This month has 31 days.");
    }
    else if(InputMonth == 8) {
        System.out.println("This month has 31 days.");
    }
    else if(InputMonth == 9) {
        System.out.println("This month has 30 days.");
    }
    else if(InputMonth == 10) {
        System.out.println("This month has 31 days.");
    }
    else if(InputMonth == 11) {
        System.out.println("This month has 30 days.");
    }
    else if(InputMonth == 12) {
        System.out.println("This month has 31 days.");
    }
    else if(InputMonth>12){
        System.out.println("You did not eneter an integer between 1 and 12.");
    }
    else if(InputMonth == 0) {
         System.out.println("You did not eneter an integer between 1 and 12.");
    }
    else if(InputMonth<0) {
         System.out.println("You did not eneter an integer between 1 and 12.");
    }

        
    }//end of main method
        }//end of class