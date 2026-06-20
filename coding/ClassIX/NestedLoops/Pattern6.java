package NestedLoops;
import java.util.*;

/**
 * Write a description of class Pattern7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pattern6
{
    public static void main(String[] args){
        int i, j, lines, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter number of lines: ");
        lines = sc.nextInt();
        if(lines % 2 == 1){
            m = lines / 2;
            for(i = 0; i <= m; i++){
                //loop for space
                for(j = 0; j < m - i; j++){
                    System.out.print(" ");
                }
                if(i == 0){
                    System.out.print("*\n");
                }
                else{
                    System.out.print("* *\n");
                }
            }

            //next part
            for(int k = i; i < lines; i++){
                for(j = k; j <= i; j++){
                    System.out.print(" ");
                }
                if(i == lines - 1){
                    System.out.print("*\n");
                }
                else{
                    System.out.print("* *\n");
                }
            }
        }
        else{
            System.out.print("\nEntered number of lines is even.");
        }
    }
}