package MyArrays.TwoDimensionalArray;


/**
 * Write a description of class Q29 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q29
{
    public static void main(String[] args){
        int a[][] = {{1,2,3},{4,5,6}, {7,8,9}};
        int sumR[] = new int[3], sumC[] = new int[3];
        int i, j, ld=0, rd=0;
        System.out.print("\fMatrix: \n");
        for(i = 0; i < a.length; i++){
            for(j = 0; j < a[i].length; j++){
                System.out.print("\t" + a[i][j]);
            }
            System.out.print("\n");
        }
        for(i = 0; i < a.length; i++){
            for(j = 0; j < a[i].length; j++){
                sumR[i] += a[i][j];
                sumC[i] += a[j][i];
            }
            ld += a[i][i];
            rd += a[i][a.length - 1 - i];
        }
        System.out.print("\nRow sum: ");
        for(i = 0; i < sumR.length; i++){
            System.out.print("\nSum of row ("+i+") elements: " + sumR[i]);
        }
        System.out.print("\nColumn sum: ");
        for(i = 0; i < sumR.length; i++){
            System.out.print("\nSum of column ("+i+") elements: " + sumC[i]);
        }
        System.out.print("\nLeft diagonal sum: " + ld);
        System.out.print("\nRight diagonal sum: " + rd);
    }
}