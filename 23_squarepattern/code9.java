import java.util.*;
class Code9{
	public static void main(String[] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++){
			int num=row*row;
			int num2=row*row+row;
			for(int j=1;j<=row;j++){
				if(i==1||i==row){
					if(j%2==1){
					System.out.print("@\t");
				
				}
					else{
					System.out.print(num);
					
				}
				}
				else{
					if(j%2==1){
					System.out.print(num2+" ");
					num2--;
				}
				else{
					System.out.print("@ ");
					num2--;
				}
			
				}
			
			}
			
			System.out.println();
		
	}

	}
}
