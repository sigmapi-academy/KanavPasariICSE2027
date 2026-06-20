package Chapter0;
import java.io.*;


/**
 * Write a description of class DemoOfInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DemoOfInput
{
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("\fEnter any number: ");
        //int x = isr.read();
        int x = Integer.parseInt(br.readLine());
        System.out.print("\nx = " + x);
    }
}