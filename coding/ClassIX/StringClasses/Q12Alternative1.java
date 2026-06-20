package StringClasses;
import java.util.*;


/**
 * Write a description of class Q11Alternative1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q12Alternative1
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sent, word="";
        System.out.print("\fEnter any sentence: ");
        sent = sc.nextLine().trim();
        int i;
        char c, nc='\0';
        sent = sent+ " ";
        for(i = 0; i < sent.length(); i++){
            c = sent.charAt(i);
            if(!Character.isSpaceChar(c) ){
                word += c;
            }
            else{
                nc = Character.toUpperCase(word.charAt(0));
                System.out.print(nc+word.substring(1).toLowerCase()+c);
                word= "";
            }
        }
    }
}