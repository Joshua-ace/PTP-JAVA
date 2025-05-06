//write a java program to find if an array contains a specific value-print(T or F)
import java.util.Scanner;
class Specific{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7};
		System.out.print("give me a number: ");
		int x = sc.nextInt();
		int flag=0;
		for(int i=0; i<arr.length;i++){
			if(arr[i]==x){
				flag++;
				break;
		}
		}
		if(flag==1){
			System.out.println("True");
	}else{
		System.out.println("false");
}
		}
}