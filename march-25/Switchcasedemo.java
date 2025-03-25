//switch case fall through topic: we get same value for multiple conditions

import java.util.Scanner;
 class Switchcasedemo{
  public static void main(String...args){
  Scanner sc = new Scanner(System.in);
  System.out.print("welcome\n");
  System.out.println("1. Addition\n 2. Subtraction\n 3.multiplication\n 4.division \n5.Exit");
  System.out.println("Select the operator you want me to perform");
  int value = sc.nextInt();
  int a,b;

  
  switch(value){
    case 1,2,3,4: 
	  System.out.println(value);
       break;
   default : 
     	      System.out.println("Thank you");
  }
  }
 }   