import java.util.*;
class code1{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter row: ");
		int row=sc.nextInt();
		for (int i=1;i<=row;i++){
			int num=i;
			for(int j=row;j>=i;j--){
				System.out.print(num++ +" ");
			}
		
				System.out.println();
		}
	}
}

