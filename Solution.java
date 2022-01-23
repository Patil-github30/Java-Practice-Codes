import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       Scanner sobj=new Scanner(System.in);
       {
           System.out.println("Enter input");
           int n=sobj.nextInt();
           
           if((n%2) !=0)
           {
               System.out.println("Weired");
           }
           else if(((n%2)==0) && (n>=2) && (n<=5))
           {
                System.out.println("Not Weired");
           }
           else if(((n%2)==0) && (n>=6) && (n<=20))
           {
                System.out.println("Weired");
           }
           else if(((n%2)==0) && (n>=20))
           {
               System.out.println("Weired");
           }
       }
    }
}
