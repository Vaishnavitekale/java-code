import java.util.*;
class code4{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			int num=1;
			for(int j=1;j<=row;j++){
				if(i+j>row){
				System.out.print(row*num++ +" ");
				}
				else{
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}
}


