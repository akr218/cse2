//Amanda Ritter
//hw04
//Course Number Java Program
//
//This program gives the semester and year for a given Course Number
//First compile the program 
    //javac CourseNumber.java
//Then run the program
    //java CourseNumber
    
import java.util.Scanner; //import scanner

public class CourseNumber {
    //main method required for every program 
    public static void main(String[] args) { 
    
    System.out.print(
        "Enter a six-digit number giving the course semester: ");
    int CourseNumber = input.nextInt();
    
    //Get Digits from Course Number 
    int FirstFour = CourseNumber%=10000;
    int LastTwo = CourseNumber%=100;
    
    if (FirstFour=)