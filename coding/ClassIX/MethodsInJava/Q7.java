package MethodsInJava;
import java.util.*;


/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{
    public void magicString(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length() - 1; i++){
            if((str.charAt(i) + 1) == str.charAt(i+1)){
                System.out.print("\nIt is a Magic String");
                return; //exit from magicString(String str)
            }
        }
        System.out.print("\nIt is not a Magic String");
    }
    
    public static void main(String[] args){
        System.out.print("\fEnter any word: ");
        new Q7().magicString(new Scanner(System.in).next());
    }
}