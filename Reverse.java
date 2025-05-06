//reverse a number n?import java.util.*;

import java.lang.*;
import java.io.*;

class Reverse
{
	public static void main (String[] args) 
	{
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
    
     while(t-->0){
        int n = sc.nextInt();
             int reverse =0;
     int last = 0;

        while(n!=0){
            last = n%10;
            reverse = (reverse*10)+last;
            n=n/10;
        }
        System.out.println(reverse);
     }
	}
}