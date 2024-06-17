import java.util.*;
class Code9{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++){
		int num=(row-1)+i;
		
			
			for(int j=1;j<=row;j++){
				if(i+j>row){
					System.out.print(num-- +" ");	
				}
				else{
					System.out.print("  ");
				}
			}
			
			for(int k=1;k<=row;k++){
				if(i==k||k>i){
					System.out.print("  ");	
				}
				else{
					System.out.print(num-- +" ");
				}
			}
	
			
		

					System.out.println();
		}
	}
}

				


