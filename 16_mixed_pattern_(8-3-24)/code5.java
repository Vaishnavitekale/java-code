import java.util.*;
class code5{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++){
			int num=i;
			for(int j=1;j<=i;j++){
				System.out.print(i*j + "  ");
			}
		
			System.out.println();
		}
	}
}



