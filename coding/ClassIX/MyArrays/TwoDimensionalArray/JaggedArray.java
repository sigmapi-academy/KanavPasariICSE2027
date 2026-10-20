package MyArrays.TwoDimensionalArray;
import java.util.*;


/**
 * Write a description of class JaggedArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JaggedArray
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int[][] a = {{1}, {1, 2, 3}, {4, 5},{6,7,8,9}};
        System.out.print("\fEnter number of rows: ");
        int rows = sc.nextInt();
        int[][] a = new int[rows][];
        int i, j;
        
        //feedind data in jagged array
        for(i = 0; i < a.length; i++){
            System.out.print("\nNumber of elements in row" +i+" : ");
            int cols =  sc.nextInt();
            a[i] = new int[cols]; //i+1 instead of columns
            for(j = 0; j < a[i].length; j++){
                System.out.print("Enter value in a["+i+"]["+j+"]: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("\nJagged Array: \n");
        for(i = 0; i < a.length; i++){
            for(j = 0; j < a[i].length; j++){
                System.out.print("\t"+a[i][j]);
            }
            System.out.print("\n");
        }
    }
}