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
    
    //Create a Scanner
        Scanner input = new Scanner(System.in);
        
    System.out.print(
        "Enter a six-digit number giving the course semester: ");
    int CourseNumber = input.nextInt();
    
    //Get Digits from Course Number 
    int FirstFour = CourseNumber/100;
    FirstFour%=10000;
    int LastTwo = CourseNumber%100;
   
    
    if (CourseNumber < 186510) {
        System.out.println("The number was outside the range [186510,201440].");
    }
    if (CourseNumber > 201440) {
        System.out.println("The number was outside the range [186510,201440].");
    }
    else if (LastTwo == 10) {
        System.out.println("The course was offered in the Spring Semester of "+FirstFour+".");
    }
    else if (LastTwo == 20) {
        System.out.println("The course was offered in the Summer 1 Semester of "+FirstFour+".");
    }
    else if (LastTwo == 30) {
        System.out.println("The course was offered in the Summer 2 Semester of "+FirstFour+".");
    }
    else if (LastTwo == 40) {
        System.out.println("The course was offered in the Fall Semester of "+FirstFour+".");
    }
    
    }//end of main method
}//end of class