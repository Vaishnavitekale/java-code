import java.util.*;
class code9{
	public static void main(String [] args){
         	Scanner sc=new Scanner(System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		char ch='a';
		for(int i=1;i<=row;i++){
			int num=row+1;
		
			for(int j=1;j<=i;j++){
				if(j%2==0){
			
					System.out.print(ch++ +" ");
			
				}
				else{

				System.out.print(num +" ");

			}
			num++;
		
		}
				System.out.println();
	}
	}
}
