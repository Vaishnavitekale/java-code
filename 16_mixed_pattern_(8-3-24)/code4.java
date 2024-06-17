import java.util.*;
class code4{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		int num=row;
		for(int i=1;i<=row;i++){
				for(int j=1;j<=i;j++){
				System.out.print(num*j + "  ");
				
			}
			num--;
			
			System.out.println();
		}
	}
}



