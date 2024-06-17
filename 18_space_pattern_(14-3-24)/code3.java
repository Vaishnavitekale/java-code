import java.util.*;
class code3{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			int ch=64;
			for(int j=1;j<=row;j++){
				if(i+j>row){
				System.out.print((char)(ch+j) +" ");
				}
				else{
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}
}


