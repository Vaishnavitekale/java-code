import java.util.*;
class code7{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i==j||j>i){
				System.out.print(num+" ");
				}
				else{
					System.out.print("  ");
				}
			}
			num--;

			System.out.println();
		}
	}
}


