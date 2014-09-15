//Amanda Ritter
//hw03
//Four Digits Java Program
//
//This program prints the first four digits to the right of the decimal point
//First compile the program
    //javac Root.java
//Then run the program
    //java Root
    
import java.util.Scanner;

public class FourDigits {
    //main method required for every program
    public static void main(String[] args) {
        
     //Declare the scanner object
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
    System.out.print("Enter a number and I display the four digits to the right of the decimal point:");
    int y = 0;
    y = myScanner.nextInt();
   
    double FourDigits = 0;
    myScanner.nextDouble();
    int FourDigits1= y*10000
    
    
    System.out.println("The four digits to the right of the decimal point are:"+FourDigits1);
        
        
            }//end of main method
        }//end of class