package NestedLoops;


/**
 * Write a description of class Q14_bPg282 here.
 * String.format("%3d", j)
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q14_bPg282
{
    public static void main(String args[]){
        System.out.print("\f");
        int row = 25;
        int i, j;
        /*for(i = 0; i < row; i++){
            for(j = 1; j <= row - i; j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }*/
        /*i = 0;
        while( i < row) {
            j = 1;
            while( j <= row - i ){
                System.out.print(j+" ");
                j++;
            }
            System.out.print("\n");
            i++;
        }*/
        for(i = 0; i < row; i++){
            j = 1;
            while( j <= row - i ){
                System.out.print(j+" ");
                j++;
            }
            System.out.print("\n");
        }
    }
}