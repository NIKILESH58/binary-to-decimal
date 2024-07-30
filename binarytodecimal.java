 import java.util.Scanner;
public class binarytodecimal
{
    public static void main(String[] args) 
     {
         Scanner sc = new Scanner(System.in);      
        int bin = sc.nextInt();
       int dec=0;
       int i=1;
       while(bin>0)
       {
    	   int bit=bin%10;
    	   dec+=bit*i;
    	   bin/=10;
    	   i*=2;
    	   
       }
       System.out.println(dec);
    }
}
