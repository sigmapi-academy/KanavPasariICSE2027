package StringClasses;
import java.util.*;


/**
 * Write a description of class Q13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q13
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word;
        int i, asc;
        System.out.print("\fEnter any word: ");
        word = sc.next();
        for(i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            asc = c;
            System.out.print("\nASCII of " + c + " = " + asc);
        }
    }
}