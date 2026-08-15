package MyArrays.TwoDimensionalArray;
import java.util.*;

/**
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MatrixOperation
{
    public static Scanner sc = new Scanner(System.in);

    public static int[][] add(int m1[][], int m2[][]){
        int R[][] = new int[m1.length][m1[0].length];
        int i, j;
        for(i = 0; i < m1.length; i++){
            for(j = 0; j < m2[i].length; j++){
                R[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return R;
    }

    public static int[][] subtract(int m1[][], int m2[][]){
        int R[][] = new int[m1.length][m1[0].length];
        int i, j;
        for(i = 0; i < m1.length; i++){
            for(j = 0; j < m2[i].length; j++){
                R[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return R;
    }

    public static void inputInMatrix(int m[][], String msg){
        System.out.print("\n"+msg+"\n");
        int i, j;
        for(i = 0; i < m.length; i++){
            for(j = 0; j < m[i].length; j++){
                System.out.print("Enter integer value in ["+i+"]["+j+"]: ");
                m[i][j] = sc.nextInt();
            }
        }
    }
    
    public static void printMatrix(int m[][], String msg){
        System.out.print("\n"+msg+"\n");
        int i, j;
        for(i = 0; i < m.length; i++){
            for(j = 0; j < m[i].length; j++){
                System.out.print("\t"+m[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    public static int[][] multiplyMatrix(int M1[][], int M2[][]){
        int m = M1.length;
        int n = M1[0].length;
        int p = M2.length;
        int q = M2[0].length;
        // check the compatibility of matrix, then allocate the 
        // memory of matrix R, and do the product.
        int R[][] = {}; //remove the curly brace and initialize the array
        //if matrix is compatible return R, otherwise return null
        return null; 
    }
}
