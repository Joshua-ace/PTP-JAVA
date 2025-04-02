 /*Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39*/

import java.util.Scanner;
 public class B1ex32{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	if(a!=b)
	{
		System.out.printf("%d != %d\n",a,b);
	}
	if(a<b)
	{
		System.out.println(a+"<"+b);
	}
	if(a<=b)
	{
		System.out.println(a+"<="+b);
	}
	}
 }
