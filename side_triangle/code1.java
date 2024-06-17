import java.util.*;
class Code1{
	public static void main(String [] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		int col=0;
		for(int i=1;i<row*2;i++){
			if(i>=row){
				col=row*2-i;
			}
			else{
				col=i;
			}
			for(int j=1;j<=col;j++){
				System.out.print("*\t");
			}
		
				System.out.println();
		}
	}
}
