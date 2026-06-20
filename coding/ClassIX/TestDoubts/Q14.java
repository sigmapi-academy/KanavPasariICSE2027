package TestDoubts;
import java.util.*;


/**
 * Write a description of class Q14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q14
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N, x, p = 1;
        System.out.print("\fEnter any number: ");
        N = sc.nextInt();
        for(x = 1; p < N; x++){
            p = x * (x+1);
            if(p == N){
                System.out.print("\nPronic Number.");
                break;
            }
        }
        if(p > N){
            System.out.print("\nNot a Pronic number.");
        }
    }
}