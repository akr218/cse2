//Amanda Riter
//hwk02
//Arithmetic Java Program
//
//This program calculates the cost of items bought
//First compile the program
//  java Arithmetic.java
//Then run the program
//  java Arithmetic.java
//
//define a class
public class Arithmetic{
    //main method required for every program
    public static void main(String[] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pairs of socks
        //('$' is part of the variable name)
        double sockCost$=2.58;
     
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        int sock1Cost$=(int)sockCost$;
        int sock2Cost$=((sock1Cost$*100)/100);
        
        int glass1Cost$=(int)glassCost$;
        int glass2Cost$=((glass1Cost$*100)/100);
        
        int envelope1Cost$=(int)envelopeCost$;
        int envelope2Cost$=((envelope1Cost$*100)/100);
        
        
System.out.println("The total cost of socks was $"+
     (nSocks * sockCost$)+" plus a sales tax of $"+
     (nSocks * sock2Cost$ * taxPercent));
System.out.println("The total cost of drinking glasses was $"+ 
    (nGlasses * glassCost$)+" plus a sales tax of $"+ 
    (nGlasses * glass2Cost$ * taxPercent));
System.out.println("The total cost of envelopes was $"+
    (nEnvelopes * envelopeCost$)+" plus a sales tax of $"+
    (nEnvelopes * envelope2Cost$ * taxPercent));
System.out.println("The total cost of purchases before tax was $"+ 
    (nSocks * sockCost$ + nGlasses * glassCost$ + 
    nEnvelopes * envelopeCost$));
System.out.println("The total actually paid including tax was $"+ 
    (nGlasses * glass2Cost$ + nGlasses * glass2Cost$ * taxPercent 
    + nSocks * sock2Cost$ + nSocks * sock2Cost$ * taxPercent + 
    nEnvelopes * envelope2Cost$ + nEnvelopes * envelope2Cost$ * taxPercent));
    
        } //end of main method
    }//end of main method