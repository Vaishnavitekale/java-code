import java.util.*;
class code2{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number: ");
		int row=sc.nextInt();
		int num=row;
		int ch=64+row;
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=row;j++){
			System.out.print((char)ch + ""+num-- +"  ");
		}
		num=row+i;
		System.out.println();

	}
}
}
