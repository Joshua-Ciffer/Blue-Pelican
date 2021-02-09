// source from:  Duncan Wallace
// Lesson 18
// 22 March 2016
import java.io.*;
import java.util.*;
public class CountEmRight
{
    public static void main(String args[])
    {
        boolean test = true;
        do{
            
            Scanner kbReader = new Scanner(System.in);
            
            System.out.println("Please input a sentence, or exit to end the program");
            
            String s = kbReader.nextLine();
            
            if (s.equals("exit"))
            {
                test=false;
            }
            else
            {
                s = s.toUpperCase();
        
                String st = s+"ttt";
                String sp[];
                
                sp = st.split("SA|S\\s+A");
                
                int length = sp.length-1;
                System.out.println("There are " + length + " occurences");
            }
            System.out.println("");
        }while (test == true);
    }
}
