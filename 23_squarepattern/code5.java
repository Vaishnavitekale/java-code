import java.util.*;
class Code5{
	public static void main(String[] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==0){
					System.out.print(num+" ");
				}
				else{
					if(j%2==0){
					System.out.print("$ ");
					num++;
				}
				else{
					System.out.print(num+" ");
				}
				}
			
			}
			System.out.println();
		}
	}
}
