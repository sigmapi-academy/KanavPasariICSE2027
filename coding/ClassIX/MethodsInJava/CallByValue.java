package MethodsInJava;


/**
 * Write a description of class CallByValue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CallByValue
{
    // The variables defined outside the scope of all the methods,
    // in the class, these types of variables are called instance variable.
    // # These variable are present in every object.
    private int data; //instance variable
    
    public void change(CallByValue ob){
        data = data + 100; //changes will be in the instance variable only
    }
    
    public static void main(String[] args){
        CallByValue ob = new CallByValue();
        ob.data = 50;
        System.out.print("\fBefore change: " + ob.data);
        ob.change(ob);
        System.out.print("\nAfter change: " + ob.data);
    }
}