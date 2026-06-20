package StringClasses;
import java.util.Scanner;


/**
 * Write a description of class LongestWord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LongestWord
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sent, word="", longWord = "";
        int i, spcIndex;
        System.out.print("\fEnter a sentence: ");
        sent = sc.nextLine();
        sent = sent.trim() + " ";
        for(i = 0; i < sent.length(); i = spcIndex + 1){
            spcIndex = sent.indexOf(" ", i);    
            word = sent.substring(i, spcIndex);
            if(word.length() > longWord.length()){
                longWord = word;
            }
        }
        System.out.print("\nThe longest word : " + longWord);
        System.out.print("\nThe length of the word is : " + longWord.length());
    }
}