//Amanda Ritter
//hw05
//Burger King Java Program
//
//This program gives a choice out of 3 random games based on input
//First compile the program 
    //javac BurgerKing.java
//Then run the program
    //java BurgerKing
    
import java.util.Scanner; //import scanner

public class BurgerKing {
    //main method required for every program 
    public static void main(String[] args) { 
    //import scanner
    Scanner input = new Scanner(System.in);
    
System.out.print("Enter a letter to indicate a choice of Burger (B or b) Soda (S or s) Fries (F or f)");
    String order = input.next();
    char order1 = 'a';

 if(order.length() > 1) {
        System.out.println("Single character expected.");
        return;
    } 
    else {
        order1 = order.charAt(0);
    }

switch (order1) {
    case ('B'): 
         System.out.print(
            "Enter A or a for 'all the fixins' C or c for cheese N or n for none of the above c");
            String burger = input.next();
            char burger1 = 'b';
    
            if(burger.length() > 1) { 
                System.out.println("Single character expected.");
                }
            else {
            burger1 = burger.charAt(0);
                switch (burger1) {
                    case 'A':
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case 'a':
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case 'C':
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case 'c':
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case 'N':
                        System.out.println("You ordered a burger with none of the above");
                        break;
                    case 'n':
                        System.out.println("You ordered a burger with none of the above");
                        break;
                    default:
                    System.out.println("You did not enter any of B, b, S, s, F, or f");
            } 
                }
            break;
            
            case ('b'):
             System.out.print(
            "Enter A or a for 'all the fixins' C or c for cheese N or n for none of the above c");
            String burger2 = input.next();
            char burger3 = 'b';
    
            if(burger2.length() > 1) { 
                  System.out.println("Single character expected.");
                } 
            else {
            burger3 = burger2.charAt(0);
                switch (burger3) {
                    case 'A':
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case 'a':
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case 'C':
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case 'c':
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case 'N':
                        System.out.println("You ordered a burger with none of the above");
                        break;
                    case 'n':
                        System.out.println("You ordered a burger with none of the above");
                        break;
                    default:
                    System.out.println("Not expected input.");
                }
            }
            
            break;
            
            case ('S'):
            System.out.print(
                "Do you want Pepsi (p or P) Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)");
            String soda = input.next();
            char soda1 = 'c';
            
            if(soda.length() > 1) {
                System.out.println("Single character expected");
                return;
            }
            else {
                soda1 = soda.charAt(0);
                switch (soda1) {
                    case 'P':
                        System.out.println("You ordered a Pepsi");
                        break;
                    case 'p':
                        System.out.println("You ordered a Pepsi");
                        break;
                    case 'C':
                        System.out.println("You ordered a Coke");
                        break;
                    case 'c':
                        System.out.println("You ordered a Coke");
                        break;
                    case 'M':
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    case 'm':
                        System.out.println("You ordered a Mountain Dew");
                        break;
                     case 'S':
                        System.out.println("You ordered a Sprite");
                        break;
                    case 's':
                        System.out.println("You ordered a Sprite");
                        break;
                    default:
                    System.out.println("You did not enter any of B, b, S, s, F, or f");
                }
           
            }
            break;
        case ('s'):
         System.out.print(
                "Do you want Pepsi (p or P) Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)");
            String soda2 = input.next();
            char soda3 = 'x';
            
            if(soda2.length() > 1) {
                System.out.println("Single character expected");
                return;
            }
            else {
                soda3 = soda2.charAt(0);
                switch (soda3) {
                    case 'P':
                        System.out.println("You ordered a Pepsi");
                        break;
                    case 'p':
                        System.out.println("You ordered a Pepsi");
                        break;
                    case 'C':
                        System.out.println("You ordered a Coke");
                        break;
                    case 'c':
                        System.out.println("You ordered a Coke");
                        break;
                    case 'M':
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    case 'm':
                        System.out.println("You ordered a Mountain Dew");
                        break;
                     case 'S':
                        System.out.println("You ordered a Sprite");
                        break;
                    case 's':
                        System.out.println("You ordered a Sprite");
                        break;
                    default:
                    System.out.println("You did not enter any of P, p, C, c, M, m, or S, s");
                }
             
            }
            break;
        case ('F'):
            System.out.print(
                "Do you want a large (L or l) or small (S or s) order of fries?");
            String fries = input.next();
            char fries1 = 'd';
            
            if(fries.length() > 1) {
                System.out.println("Single character expected");
            }
            else {
                fries1 = fries.charAt(0);
                switch(fries1){
                    case 'L':
                        System.out.println("You ordered large fries");
                        break;
                    case 'p':
                        System.out.println("You ordered large fries");
                        break;
                    case 'C':
                        System.out.println("You ordered large fries");
                        break;
                    case 'c':
                        System.out.println("You ordered large fries");
                }
             
            }
                        break;
        case ('f'):
            System.out.print(
                "Do you want a large (L or l) or small (S or s) order of fries?");
            String fries2 = input.next();
            char fries3 = 'e';
            
            if (fries2.length() > 1) {
                System.out.println("Single character expected");
            }
            else {
                fries3 = fries2.charAt(0);
                switch(fries3){
                    case 'L':
                        System.out.println("You ordered large fries");
                        break;
                    case 'p':
                        System.out.println("You ordered large fries");
                        break;
                    case 'C':
                        System.out.println("You ordered large fries");
                        break;
                    case 'c':
                        System.out.println("You ordered large fries");
                }
            }
             
                        break;
        default: 
         System.out.println("You did not enter any of B, b, S, s, F, or f");
                }
            }//end of class
        }//end of main method  
    
