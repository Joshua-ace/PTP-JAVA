import java.util.Scanner;
	class Sort1{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int he = 0;
int[] a =  {12, 15, 8, 11, 7 ,1};
		
		for(int x : a)
			System.out.print(x+" ");
			
		for(int i=0; i<a.length; i++){
		int e = a[i];
			if(he<e)
				he =e;//we set the highest element value
			//compare the highest element of an array  
				for(int j=0; j<a.length; j++){
					if(he>a[j]){
				a[i] = a[j];
				a[j] = he;
				he = a[i];
				}
				System.out.println(he);
			}
	}
}
}