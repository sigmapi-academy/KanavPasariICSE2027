package StringClasses;
import java.util.*;

/**
 * Write a description of class IntersetingStringCode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntersetingStringCode
{
    public static void main(String[] args){
        Random r = new Random();
        String smallAlpha = "abcdefghijklmnopqrstuvwxyz";
        String bigAlpha = smallAlpha.toUpperCase();
        String space = " ";
        String tab = "\t";
        String enterKey = "\n";
        int i, sizeOfName, sizeOfSurname, numOfNames, j;
        String name, surName;
        Scanner sc = new Scanner(System.in);
        //Random name Name(4-10), Surname(4-10)
        System.out.print("\nHow many names you want to generate: ");
        numOfNames = sc.nextInt();
        for(i = 0; i < numOfNames; i++){
            sizeOfName = r.nextInt(4, 11);
            sizeOfSurname = r.nextInt(4, 11);
            //name
            name = ""+bigAlpha.charAt(r.nextInt(26));
            for(j = 1; j < sizeOfName; j++){
                name += smallAlpha.charAt(r.nextInt(26));
            }
            //surName
            surName = ""+bigAlpha.charAt(r.nextInt(26));
            for(j = 1; j < sizeOfSurname; j++){
                surName += smallAlpha.charAt(r.nextInt(26));
            }
            System.out.print(enterKey+ i+ tab + name + space + surName);
        }
    }
}