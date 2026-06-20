package StringClasses.Test;
import java.util.*;


/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if character already appeared before
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            // If not counted, count frequency
            if (!alreadyCounted) {
                int count = 0;
                for (int k = 0; k < str.length(); k++) {
                    if (str.charAt(k) == ch) {
                        count++;
                    }
                }
                System.out.println(ch + " - " + count);
            }
        }
    }
}
