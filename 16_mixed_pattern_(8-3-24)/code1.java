import java.util.*;
class code1{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number: ");
		int num=1;
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
			System.out.print(num++ +"  ");
		}
			System.out.println();

	}
}
}
