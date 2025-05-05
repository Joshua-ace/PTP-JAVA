//write a java program to sort a nummeric array.java coding  boot camps
class Sort{
	public static void main(String...args){
		int arr[] = {12, 15, 8, 11, 7 ,1};
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; i<arr.length; i++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					}
					System.out.println(arr[j]);
				}
			}
		}
	}
			