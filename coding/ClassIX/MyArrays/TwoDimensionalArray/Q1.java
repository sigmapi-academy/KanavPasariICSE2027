package MyArrays.TwoDimensionalArray;
import java.util.*;


/**
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("\f");
        int M, N, M1[][], M2[][], R[][];
        System.out.print("Enter number of rows: ");
        M = sc.nextInt();
        System.out.print("Enter number of columns: ");
        N = sc.nextInt();
        //memory allocation for Array
        M1 = new int[M][N];
        M2 = new int[M][N];
        R = new int[M][N];
        
        MatrixOperation.inputInMatrix(M1, "Enter values in M1[][]: ");
        MatrixOperation.inputInMatrix(M2, "Enter values in M2[][]: ");
        R = MatrixOperation.add(M1, M2);
        MatrixOperation.printMatrix(M1, "First matrix:");
        MatrixOperation.printMatrix(M2, "Second matrix:");
        MatrixOperation.printMatrix(R, "Sum of first matrix and second matrix:");
        R = MatrixOperation.subtract(M1, M2);
        MatrixOperation.printMatrix(R, "Difference of first matrix and second matrix:");
        
        // Declare 2 more matrix of size m x n and p x q and store the
        // product in R[][], print all the matrix, if (R!= null)
        // write your code here
    }
}
