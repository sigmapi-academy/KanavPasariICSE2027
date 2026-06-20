package StringClasses;
import java.util.*;


/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter a string: ");
        String str = sc.nextLine();
        int start, end;
        char c1, c2;
        String nstr = str.toLowerCase();
        for(start = 0, end = nstr.length() - 1; start < end; start++, end--){
            c1 = nstr.charAt(start);
            c2 = nstr.charAt(end);
            if(c1 != c2){
                System.out.print("\nNot palindrome String.");
                break;
            }
        }
        if(start == end){
            System.out.print("\nPalindrome String.");
        }
    }
}