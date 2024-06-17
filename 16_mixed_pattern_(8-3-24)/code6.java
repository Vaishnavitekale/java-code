import java.util.*;
class code6{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			int num=row+96;
			int num2=row;
			for(int j=1;j<=i;j++){
				if(i%2==0){
				System.out.print(num2-- + "  ");
			}
			else{
				System.out.print((char)num-- + "  ");
			}
			}
			System.out.println();
		}
	}
}



