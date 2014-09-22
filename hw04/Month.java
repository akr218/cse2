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
     
        int year = input.nextInt();
        //Check if the year is a leap year 
        boolean isLeapYear = 
            (year %4 ==0 && year % 100 !=0) || (year%400 == 0);
            
    System.print(
        "Enter an integer giving the number of the month (1-12): ");
        int InputMonth = 0;
        InputMonth = input.nextInt();
        
    if(InputMonth=1) {
        System.out.println("This month has 31 days.");
    }
    if(InputMonth=2) {
        System.out.print(
            "Enter the year: ");
        int year = input.nextInt();
    }
    if(InputMonth=3) {
        System.out.println("This month has 31 days.");
    }
    if(InputMonth=4) {
        System.out.println("This month has 30 days.");
    }
    if(InputMonth=5) {
        System.out.println("This month has 31 days.");
    }
    if(InputMonth=6) {
        System.out.println("This month has 30 days.");
    }
    if(InputMonth=7) {
        System.out.println("This month has 31 days.");
    }
    if(InputMonth=8) {
        System.out.println("This month has 31 days.");
    }
    if(InputMonth=9) {
        System.out.println("This month has 30 days.");
    }
    if(InputMonth=10) {
        System.out.println("This month has 31 days.");
    }
    if(InputMonth=11) {
        System.out.println("This month has 30 days.");
    }
    if(InputMonth=12) {
        System.out.println("This month has 31 days.");
    }
    else {
        System.out.println("You did not eneter an integer.");
    return; //leaves the program
    }

        
    }//end of main method
        }//end of class