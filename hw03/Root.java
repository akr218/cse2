//Amanda Ritter
//hw03
//Root Java Program
//
//This program prints out an estimate of the cube root of the input integer
//First compile the program
    //javac Root.java
//Then run the program
    //java Root
    
import java.util.Scanner;

public class Root {
    //main method required for every program
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
    System.out.print(
        "Enter an integer: ");
        int x = 0; 
        x = myScanner.nextInt();  
    
        double guess = 0; 
        guess = x/3;
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        
        
    System.out.println("The cube root of your integer is approximately "+guess);
    System.out.println(guess+"*"+guess+"*"+guess+"="+guess*guess*guess);
        
        }//end of main method
    }//end of class

