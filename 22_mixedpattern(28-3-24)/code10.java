import java.util.*;
class Code10{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++){
		int num=i;
		int num2=2;
		
			
			for(int j=1;j<=row;j++){
				if(i+j>row){
					System.out.print(num-- +" ");	
				}
				else{
					System.out.print("  ");
				}
			}
			
			for(int k=1;k<=row-1;k++){
				if(i==k||k>i){
					System.out.print("  ");	
				}
				else{
					System.out.print(num2++ +" ");
				}
			}

	
			
		

					System.out.println();
		}
	}
}

				


