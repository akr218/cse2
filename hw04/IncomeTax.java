//Amanda Ritter
//hw04
//Income Tax Java Program
//
//This program gives the amount of tax collected on a given amount of income
//First compile the program 
    //javac IncomeTax.java
//Then run the program
    //java IncomeTax
    
import java.util.Scanner; //import scanner

public class IncomeTax {
    //main method required for every program 
    public static void main(String[] args) { 
        
        //introduce scanner
        Scanner myScanner = new Scanner(System.in); 
        
    System.out.print(
        "Enter an int giving the number in thousands: ");
        double income = 0;
        income = myScanner.nextDouble();
        
        double Tax1 = income*0.05; //compute tax
        double TaxRate1 = 5.0; //define tax rate
        
        double Tax2 = income*0.07;
        double TaxRate2 = 7.0;

        double Tax3 = income*0.12;
        double TaxRate3 = 12.0;
        
        double Tax4 = income*0.14;
        double TaxRate4 = 14.0;
        
    if(income < 0) {
        System.out.println("You did not enter a positive integer.");
    }
    else if(income == 0) {
        System.out.println("You did not enter a positive integer.");
    }
    else if(income<20) { //compute tax for incomes under 20 thousand
        System.out.println("The tax rate on $"+(int)income*1000+" is %"+TaxRate1+" and the tax is $"+Tax1*1000+".");
    }
    else if(income >= 20 && income < 40) { //compute tax for incomes between 20 and 40 thousand
        System.out.println("The tax rate on $"+(int)income*1000+" is %"+TaxRate2+" and the tax is $"+Tax2*1000+".");
    }
    else if(income >= 40 && income < 78) { //compute tax for incomes between 40 and 78 thousand
       System.out.println("The tax rate on $"+(int)income*1000+" is %"+TaxRate3+" and the tax is $"+Tax3*1000+".");
    }
    else if(income > 78) { //compute tax for incomes above 78 thousand
        System.out.println("The tax rate on $"+(int)income*1000+" is %"+TaxRate4+" and the tax is $"+Tax4*1000+".");
    }
  
        }//end of main method
    }//end of class
        
        
