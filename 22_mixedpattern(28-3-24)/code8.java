import java.util.*;
class Code8{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		int num1=row;
		int num=row;
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=row;j++){
				if(i+j>row){
					System.out.print(num++ +" ");	
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
					System.out.print(num++ +" ");
				}
			}
			num=num1-i;
				
			
		

					System.out.println();
		}
	}
}

				


