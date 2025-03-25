import java.util.Scanner;
class B1ex13{
 public static void main(String...args){
  Scanner sc = new Scanner(System.in);
    System.out.println("a is");
  int a = sc.nextInt();
    System.out.println("b is");
  int b = sc.nextInt();
  
  int temp = a;
  a = b;
  b = temp;
  System.out.println("swapped a is"+a);
    System.out.println("swapped b is"+b);
}
}  