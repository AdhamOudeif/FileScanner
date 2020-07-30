//ADHAM OUDEIF 
//The program reads a text file, converts the numbers into integers using parse
//method and takes those converted and adds them up. then displays the sum
import java.io.*;
import java.util.*;


public class Program5
{
    public static void main(String[] args)throws Exception
    {
       //variables
       String filename;
       String current_data;
       int sum=0;
      
       //Scanner to get input from user to get name of file we read from 
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter File Name");
       filename=scan.next();
      
       //input stream object
       Scanner kb = new Scanner(new File(filename));
      
       //repeat until read every data in the file
       while (kb.hasNext())
       {
           //reading data from file
           current_data = kb.next();
          
           //try block if string is a number
           try
           {
               //converting data into integer
               
               int number = Integer.parseInt(current_data);
              
               //adds all the integers that were accepted
               sum=sum+number;
           }
           //incase if its not an integer
           catch(NumberFormatException nfe)
           {};
       }
       
       System.out.println("Sum of integers in "+filename+" is "+sum);
    }
}
//Enter File Name
//inputP5.txt
//Sum of integers in inputP5.txt is 21
//THE INPUT:
/*3  1.1  a1  2  1  7n
1 2 9.3 vv 6
7.2 abc  5 :+  -4
5
xx yy zz*/
