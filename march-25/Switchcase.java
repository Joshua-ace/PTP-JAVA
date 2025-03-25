//write a program to perfrom a calculation in switch case 

import java.util.Scanner;
 class Switchcase{
  public static void main(String...args){
  Scanner sc = new Scanner(System.in);
  System.out.print("welcome\n");
  System.out.println("1. Addition\n 2. Subtraction\n 3.multiplication\n 4.division \n5.Exit");
  System.out.println("Select the operator you want me to perform");
  int value = sc.nextInt();
  int a,b;
  System.out.println("enter two values:");
  a = sc.nextInt();
  b = sc.nextInt();
  
  switch(value){
    case 1: 
          System.out.println("Addition is "+(a+b));
		  break;
    case 2: 
		  System.out.println("subtraction is "+(a-b));
		  break;
    case 3:
		  System.out.println("multiplication is "+(a*b));
		  break;
   case 4: 
  	      System.out.println("division is "+(a/b));
		  break;
   default : 
     	      System.out.println("Thank you");
  }
  }
 }   