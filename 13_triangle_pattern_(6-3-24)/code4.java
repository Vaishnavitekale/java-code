import java.util.*;
class code4{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter row: ");
		int row=sc.nextInt();
		int num=0;
		for(int r=1;r<=row;r++){
			num=num+r;
		}
		int ch=64+num;
		for (int i=1;i<=row;i++){
			for(int j=row;j>=i;j--){
				System.out.print((char)ch +" ");
				ch--;
			}
		
				System.out.println();
		}
	}
}

