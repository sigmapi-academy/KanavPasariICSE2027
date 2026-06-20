package MethodsInJava;
import java.util.*;


/**
 * Write a description of class Greetings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Greetings
{
    public void greet(){ //function prototype
        System.out.print("\nWelcome to Java Programming: ");
    }
    //function overloading the name of function is same but differs
    // with number of parameters or type of parameters.
    public void greet(String name){ //function prototype
        System.out.print("\n"+name+"! Welcome to Java Programming! " );
    }
    
    public static void main(String[] args){
        System.out.print("\f");
        Greetings g = new Greetings();
        g.greet(); //function signature is used to call the function 
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your name: ");
        String name = sc.nextLine();
        g.greet(name); 
        g.greet("Shiv");
    }
}