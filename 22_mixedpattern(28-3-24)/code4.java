import java.util.*;
class Code4{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
		int ch=65;
			
			for(int j=1;j<=row;j++){
				if(i==j||j>i){
					System.out.print((char)ch+" ");
					
					
				}
				else{

					System.out.print("  ");
				}
				ch++;
			}
		
			
			System.out.println();
			}
	}
}

				


