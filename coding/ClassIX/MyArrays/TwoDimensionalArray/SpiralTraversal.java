package MyArrays.TwoDimensionalArray;
import java.util.*;

/**
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SpiralTraversal
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("\fEnter the dimension of 2d matrix: ");
        int m = sc.nextInt(), n = sc.nextInt();
        int matrix[][] = new int[m][n];
        Random r = new Random();
        int i, j;
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                matrix[i][j] = r.nextInt(10, 100);
            }
        }
        
        TwoDArrayUtil.printInt2DArray(matrix, "Matrix:");
        printClockwise(matrix, m, n);
    }

    public static void printClockwise(int[][] matrix, int rows, int cols){
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;
        int i;
        System.out.print("\nClockwise Spiral: ");
        while(top <= bottom && left <= right){
            //1. Move right across the top row
            for(i = left; i <= right;i++){
                System.out.print(matrix[top][i]+ " ");
            }
            //Shrink top boundary
            top++;

            //2. Move Down along the right column
            for(i = top; i <= bottom; i++){
                System.out.print(matrix[i][right]+ " ");
            }
            //Shrink right boundary
            right--;
            //3. Move left across the bottom row (if rows remain)
            if(top <= bottom){
                for(i = right; i >= left; i--){
                    System.out.print(matrix[bottom][i] + " ");
                }
                //shrink bottom boundary
                bottom--;
            }

            //4. move up along the left column (if column remain)
            if(left <= right){
                for(i = bottom; i >= top; i--){
                    System.out.print(matrix[i][left] + " ");
                }
                //Shrink left boundary
                left++;
            }
        }
    }
}
