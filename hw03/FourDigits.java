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

public class Root {
    //main method required for every program
    public static void main(String[] args) {
        
     //Declare the scanner object
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
    System.out.print(
        "Enter the number of Big Macs (an integer > 0): ");
        int nBigMacs=myScanner.nextInt();
        
    System.out.print(
        "Enter the cost per BigMac as" +
        "a double in the form xx.xx");
        double bigMac$ = myScanner.nextDouble();
	System.out.print(
        "Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100; //user enters percent, but I want
        //proportion
        
    System.out.println("Enter a number and I will display four digits
        to the right of the decimal point:"Enter a number and I will display four digits
        to the right of the decimal point:");