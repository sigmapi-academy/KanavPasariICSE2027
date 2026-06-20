package StringClasses;
import java.util.*;


/**
 * Write a description of class Q14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q14
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sent, vowel = "aeiouAEIOU";
        System.out.print("\fEnter any sentence: ");
        sent = sc.nextLine();
        char c;
        int i;
        for(i = 0; i < sent.length(); i++){
            c = sent.charAt(i);
            if(vowel.indexOf(c) > -1){
                System.out.print("*");
            }
            else{
                System.out.print(c);
            }
        }
    }
}