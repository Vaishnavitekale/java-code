import java.util.*;
class code5{
	public static void main(String [] args){
         	Scanner sc=new Scanner(System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		int ch= 65+row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)ch++ +" ");
			}
				System.out.println();
		}
	}
}
