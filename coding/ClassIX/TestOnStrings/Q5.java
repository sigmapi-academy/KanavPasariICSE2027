package TestOnStrings;
import java.util.*;

/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5
{
    public boolean checkRotate(String str1, String str2){
        int i;
        if(str1.length() == str2.length()){
            for(i = 0; i < str1.length(); i++){
                str1 = str1.substring(1) + str1.charAt(0);
                if(str1.equals(str2)){
                    return true;
                }
            }   
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Q5 obq5 = new Q5();
        String s1, s2;
        System.out.print("\nEnter any string: ");
        s1 = sc.nextLine();
        System.out.print("\nEnter any string: ");
        s2 = sc.nextLine();
        if(obq5.checkRotate(s1, s2)){
            System.out.print("\n" + s2 + " is rotation of " + s1);
        }
        else{
            System.out.print("\n" + s2 + " is not a rotation of " + s1);
        }
    }
}