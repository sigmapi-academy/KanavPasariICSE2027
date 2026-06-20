package StringClasses;
import java.util.*;


/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{
    public static void main(String[] args){
        String name="", lastName;
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter name: ");
        int i, n = 3;
        for(i = 0; i < n; i++){
            name += sc.nextLine().trim()+" ";
        }
        int lspci = name.trim().lastIndexOf(" ");
        lastName = name.trim().substring(lspci+1);
        System.out.print("\n"+lastName + " " + name.substring(0, lspci));
    }
}