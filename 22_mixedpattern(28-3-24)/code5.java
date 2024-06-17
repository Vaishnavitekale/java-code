import java.util.*;
class Code5{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		int num=3;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==0){
					System.out.print(num+"    ");
					
					
				}
				else{
					System.out.print(num*num+"  ");
				}
				num++;
			}
			
					System.out.println();
			}
	}
}

				


