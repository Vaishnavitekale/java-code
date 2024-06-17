import java.util.*;
class Code5{
	public static void main(String[]  arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		
		int num=row;
		for(int i=0;i<row;i++){
			for(int j=0;j<row;j++){
				if(num%2==0){
					System.out.print(num*num+"	  ");
				}
				else{
					System.out.print(num+"	      ");
				}
				num++;
			
			}
					System.out.println();
		}
	}
}

			
