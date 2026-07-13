package MyArrays.TwoDimensionalArray;
import java.util.*;


/**
 * Write a description of class Test2DArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test2DArray
{
    public static void main(String[] args){
        int rows, columns;
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        columns = sc.nextInt();
        int[][] A = new int[rows][columns];
        TwoDArrayUtil.inputInt2DArray(A, "Enter values in A[][]:");
        TwoDArrayUtil.printInt2DArray(A, "Array A[][]: ");
    }
}