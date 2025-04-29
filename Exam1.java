class Exam1{
	public static void main(String...main){
		int x[] ={10 , 4, 5, 87, 34, 4,11,4,10,11};
		for(int i=0 ; i<x.length; i++){
		int p=0;
			for(int j=i+1; j<x.length; j++){
				if(x[i] == x[j] && x[i]!=Integer.parseInt("*")){
					if(p==0){
						System.out.print(x[i] +" ");
						p++;
					}
					x[j] = Integer.parseInt("*");
				}
			}
		}
	}
}


   