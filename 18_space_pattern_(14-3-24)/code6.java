import java.util.*;
class code6{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i==j||j>i){
				System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}


