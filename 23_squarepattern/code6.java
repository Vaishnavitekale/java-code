import java.util.*;
class Code6{
	public static void main(String[] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
		int num=row*row;
			for(int j=1;j<=row;j++){
				if(i%2==1){
					System.out.print(num+" ");
					num--;
				}
				else{
					if(j==1){
					System.out.print(num+" ");
				}
				else{
					if((i+j)%2==0){
					num=num-5;
					System.out.print(num+" ");
					
					}
					else{
					System.out.print(num+" ");
				}
			
				}
			
			}
			}
			System.out.println();
		
	}

	}
}
