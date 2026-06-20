package StringClasses;
import java.util.*;


/**
 * Write a description of class Q11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q12
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sent;
        System.out.print("\fEnter any sentence: ");
        sent = sc.nextLine().trim();
        int i;
        char c, nc='\0';
        sent = " " + sent;
        for(i = 0; i < sent.length() - 1; i++){
            c = sent.charAt(i);
            nc = sent.charAt(i+1);
            if(Character.isSpace(c) && Character.isLetter(nc)){
                System.out.print(Character.toUpperCase(nc));
            }
            else{
                System.out.print(Character.toLowerCase(nc));
            }
        }
    }
}