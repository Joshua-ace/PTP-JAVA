//write a java program to find the index of an array element
//o/p: Fount at :indexvalue | Not found

import java.util.Scanner;
class Specific1{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7};
		int flag = 0;
		System.out.print("give me a number: ");
		int x = sc.nextInt();
		for(int i=0; i<arr.length; i++){
			if(arr[i]==x){
				flag++;
				System.out.print("FOUND AT INDEX: "+flag);
				}
			}
		if(flag==0){
		System.out.print("NOT FOUND");
				}
		}
	}
	