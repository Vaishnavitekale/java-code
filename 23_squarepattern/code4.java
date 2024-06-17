import java.util.*;
class Code4{
	public static void main(String[] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==1){
					System.out.print("& ");
				}
				else{
					if(j%2==0){
					System.out.print("$ ");
				}
				else{
					System.out.print("& ");
				}
				}
			
			}
			System.out.println();
		}
	}
}
