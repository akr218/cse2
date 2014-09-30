//Amanda Ritter
//hw05
//BoolaBoola Java Program
//
//This program gives a choice out of 3 random games based on input
//First compile the program 
    //javac BoolaBoola.java
//Then run the program
    //java BoolaBoola
    
import java.util.Scanner; //import scanner
import java.util.Random; //import Random number generator

public class BoolaBoola {
    //main method required for every program 
    public static void main(String[] args) { 
    //import scanner
    Scanner input = new Scanner(System.in); 
    
    //public static char getRandomCharacter(char1 ch1, char ch2) {
       //return(char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    //}
    //public static char getRandomDigitCharacter() {
        //return getRandomCharacter('0','1');
    //} 
    //^see page 
    
    int Boola1 = (int)Math.random()*2;
    boolean Boola1String = true;
        if(Boola1 == 0) { 
            Boola1String = true;
        }
        else if (Boola1 == 1) {
            Boola1String = false; 
        }
    //Random RandomBoola2 = new Random(0,1);
    //int Boola2 + nextInt(): (0,1); **ASK FOR HELP --> textbook p. 335 how to use??
    int Boola2 = (int)(Math.random()*2);
    boolean Boola2String = true;   
        if(Boola2 == 0) { 
            Boola2String = true;
        }
        else if (Boola2 == 1 ) {
            Boola2String = false; 
        }
    int Boola3 = (int)(Math.random()*2); 
    boolean Boola3String = true;  
        if(Boola3 == 0) { 
            Boola3String = true;
        }
        else if (Boola3 == 1) {
            Boola3String = false; 
        }
    int Expression1 =(int)(Math.random()*2); 
    String Expression1String = " ";
        if(Expression1 == 0) {
            Expression1String = "||";
        }
        else if(Expression1 == 1) {
            Expression1String = "&&"; 
        }
    int Expression2 = (int)(Math.random()*2); 
    String Expression2String = " "; 
        if(Expression2 == 0) {
            Expression2String = "||";
        }
        else if(Expression1 == 1) {
            Expression2String = "&&"; 
        }
        
    if (Expression1 == 0 && Expression2 == 0) {
        if (Boola1 == 0 || Boola2 == 0) {
            boolean Answer1 = true;
        }
        String RealAnswerString1 = " ";
            if (Boola3 == 0) { 
                RealAnswerString1 = "true"; 
            }
        else {
            RealAnswerString1 = "false";
            }
        }
        
    if (Expression1 == 1 && Expression2 == 1) {
        if (Boola1 == 1 || Boola2 == 1) {
            boolean Answer1 = true;
        }
        String RealAnswerString1 = " ";
            if (Boola3 == 1) { 
                RealAnswerString1 = "true"; 
            }
        else {
            RealAnswerString1 = "false";
            }
        }
    
    if (Expression1 == 0 && Expression2 == 1) {
        if (Boola1 == 0 || Boola2 == 1) {
            boolean Answer1 = true;
        }
        String RealAnswerString1 = " ";
            if (Boola3 == 0) { 
                RealAnswerString1 = "false"; 
            }
        else {
            RealAnswerString1 = "true";
            }
        }
        
    if (Expression1 == 1 && Expression2 == 0) {
        if (Boola1 == 1 || Boola2 == 0) {
            boolean Answer1 = false;
        }
        String RealAnswerString1 = " ";
            if (Boola3 == 1) { 
                RealAnswerString1 = "true"; 
            }
        else {
            RealAnswerString1 = "false";
            }
        }
        
        
        //compare booleans and if they are)
        //boola1 OR boola2 are true, answer is true
        //if boola3 is true, realAnswer = true
        //else realAnswer = false
        
    //if (Boola1String == 1 && Boola2String == 1) {
        //if (Boola1 String )
        
   // if (Boola1String == 0 && Boola2String == 1) { 
        
   // if (Boola1String == 1 && Boola2String == 0) { 
    System.out.print(
        "Does "+Boola1String+" "+Expression1String+" "+Boola2String+" "+Expression2String+" "+Boola3String+" have the value true(T/t) or false(F/f)? ");
        String Answer = input.next();
        
    }//end of main method
}//end of class