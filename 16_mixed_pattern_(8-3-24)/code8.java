import java.util.*;
class code8{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		int sum=0;
		for(int r=1;r<=row;r++){
			sum=sum+r;
		}
		int num=64+sum;
		for(int i=1;i<=row;i++){
			
			for(int j=row;j>=i;j--){
				
				System.out.print((char)num-- + "  ");

				
			}
			
			
		
		
			System.out.println();
		}
	}
}



