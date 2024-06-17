import java.util.*;
class code7{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		int num=2;
		for(int i=1;i<=row;i++){
			
			for(int j=row;j>=i;j--){
				System.out.print(num + "  ");
				num=num+2;
			}
		
			System.out.println();
		}
	}
}



