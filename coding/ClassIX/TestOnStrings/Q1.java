package TestOnStrings;
import java.util.*;

/**
 * 1. String Compression Program
 * Write a Java program to accept a string and compress it
 * by replacing consecutive repeated characters with the 
 * character followed by its count.
 * Example:
 * Input: aaabbccccd
 * Output: a3b2c4d1
 * Requirements:
 *  Handle both uppercase and lowercase separately.
 * If no repetition, still display count as 1.
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
    /**
     * @param str Any String
     */
    public String compressString(String str){
        String nstr = "";
        char c,i;
        int j, count;
        for( i = 'a'; i <= 'z'; i++){
            count = 0;
            for(j = 0; j < str.length(); j++){
                c = str.charAt(j);
                if(Character.toLowerCase(c) == i){
                    count++;        
                }
            }
            if(count > 0){
                nstr = nstr + i + count;
            }
        }
        return nstr;
    }
    

    public static void main(String[] args){
        Q1 ob = new Q1();
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter any string: ");
        String str = sc.nextLine();
        String value = ob.compressString(str);
        System.out.print("\nCompressed String: " + value);
    }
}