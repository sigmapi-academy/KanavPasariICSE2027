package StringClasses;
import java.util.*;

/**
 * Write a description of class LongestWordSchoolTechnique here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LongestWordSchoolTechnique
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sent, word="", longWord = "";
        int i, spcIndex;
        System.out.print("\fEnter a sentence: ");
        sent = sc.nextLine();
        sent = sent.trim() + " ";
        for(i = 0; i < sent.length(); i++){
            char c = sent.charAt(i);
            if(c != ' '){
                word += c;
            }
            else{
                if(word.length() > longWord.length()){
                    longWord = word;
                } 
                word = ""; //empty the word
            }
        }
        System.out.print("\nThe longest word : " + longWord);
        System.out.print("\nThe length of the word is : " + longWord.length());
    }
}