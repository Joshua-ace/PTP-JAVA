//to solve quadratic equation(use if, elseif and else) 
import java.util.*;
class Quad{
 public static void main(String...args){
  Scanner sc = new Scanner(System.in);
  double a = sc.nextDouble();
  double b = sc.nextDouble();
  double c = sc.nextDouble();
  //discriminant
   double d = (b*b-4*a*c);
   
  double i = (-b+Math.sqrt(d))/(2*a);
    double j = (-b-Math.sqrt(d))/(2*a);
	
   if(d>0){
   System.out.println(i+"and"+j);
   }
   else if (d==0) {
	       System.out.print("roots are equal");
   }
   else{
	       System.out.print("roots are imaginary");
   }
 }
}
   
   