//Switch expression

import java.util.Scanner;
 class Switchcasedemo2{
  public static void main(String...args){
  Scanner sc = new Scanner(System.in);
  
  System.out.print("welcome\n");
  System.out.println("1. Addition\n 2. Subtraction\n 3.multiplication\n 4.division \n5.Exit");
  System.out.println("Select the operator you want me to perform");
  int value = sc.nextInt();
  int a=5,b=5;

  int x = switch(value){
    case 1->{
		System.out.print("the addition of a and b is: ");
		yield a+b;
  };
  System.out.print(value);

  }
 }   }
 //in next class sir will be teaching about nested switch, bitwise operator and patterns