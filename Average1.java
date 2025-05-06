//write a java program to calculate the average value of array elements?

class Average1{
	public static void main(String...args){
		int arr[] = {1,2,3,4,5,6,7};
		int sum = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++){
		sum = sum+arr[i];
		count++;
		}
		System.out.println("the avg of array elements is: "+(sum/count));
		}
	}