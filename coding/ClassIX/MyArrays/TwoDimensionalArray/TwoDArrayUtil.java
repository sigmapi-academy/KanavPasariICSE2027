package MyArrays.TwoDimensionalArray;
import java.util.*;


/**
 * Write a description of class TwoDArrayUtil here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoDArrayUtil
{
    private static Scanner sc = new Scanner(System.in);
    /**
     * This function takes data input in each element from the user.
     * @param arr int array in which data will inserted by the user
     * @param msg Any message or text displayed on the terminal.
     */
    public static void inputInt2DArray(int[][] arr, String msg){
        System.out.print("\n" + msg + "\n");
        int i, j;
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr[i].length; j++){
                System.out.print("Enter integer value in ["+i+"]["+j+"]: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
    
    /**
     * This functions display on terminal int 2D array in matrix format
     * @param arr Two dimensional int array.
     * @param msg Any String message print with Array.
     */
    public static void printInt2DArray(int[][] arr, String msg){
        System.out.print("\n" + msg + "\n");
        int i, j;
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr[i].length; j++){
                System.out.print("\t" + arr[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    public static void multiplyMatrix(int m1[][], int m2[][], int r[][]){
        
    }
}