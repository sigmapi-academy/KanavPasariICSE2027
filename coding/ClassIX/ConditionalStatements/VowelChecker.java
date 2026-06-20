package ConditionalStatements;
import java.util.*;

/**
 * Write a description of class VowelChecker here.
 *
 * @author (Shiv)
 * @version (1.0 14-05-2025)
 */
public class VowelChecker
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        char c;
        System.out.print("Enter an alphabet: ");
        c = sc.next().charAt(0);
        if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z')){
            switch(c){
                case 'A': case 'E': case 'I': case 'O': case 'U':
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    System.out.print("\nThe entered character is vowel.");
                    break;
                default:
                    System.out.print("\nEntered character is a consonant.");
            }
        }
        else{
            System.out.print("\nEntered charater is not an alphabet.");
        }
    }
}
