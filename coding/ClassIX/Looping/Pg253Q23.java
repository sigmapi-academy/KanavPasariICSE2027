package Looping;
import java.util.Scanner;

/**
 * Write a description of class Pg253Q23 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pg253Q23
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x=2, ch, sign = 1, i, t, sum = 0;
        System.out.print("\f");
        for(;;){
            System.out.print("\nPress 1 for series x^1-x^2+x^3-..."+
                "\nPress 2 for series 1, 11, 111, 1111, 11111" +
                "\nPress 0 to exit\nEnter your choice:");
            ch = sc.nextInt();
            String output = ""; 
            switch(ch){
                case 1:
                    for(i = 1, sum = 0, sign = 1; i < 20; i++, sign *=-1){
                        t = (int)Math.pow(x, i)*sign;
                        sum += t;
                        if(t < 0){
                            output += (sign*x)+"^"+i+"+";
                        }
                        else{
                            output += x+"^"+i;   
                        }
                    }
                    t = (int)Math.pow(x, i)*sign;
                    sum += t;
                    output += (sign*x)+"^"+i;
                    output += " = " + sum;
                    System.out.print("\n"+output+"\n");
                    break;
                case 2:
                    output = "";
                    t = 0;
                    for(i = 0; i < 4; i++){
                        t += (int)Math.pow(10, i);
                        output += t+", ";
                    }
                    t += (int)Math.pow(10, i);
                    output += t;
                    System.out.print("\n" + output+"\n");
                    break;
                case 0:
                    System.out.print("\nGood Bye!");
                    System.exit(ch);
                default:
                    System.out.print("\nWrong option is pressed: " + ch);
            }
        }
    }
}