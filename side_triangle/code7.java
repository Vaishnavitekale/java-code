import java.util.*;
class Code7{
	public static void main(String [] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		int col=0;
		for(int i=1;i<row*2;i++){
			int num=i;
			if(i>row){
				col=i-row;
			}
			else{
				col=row-i;
				
			}
			for(int j=1;j<=col;j++){
				System.out.print(" " +"\t");
			}
			if(i>=row){
				col=(row*2-i);
				num=col;

			}
			else{
				col=i;
				
			}
			for(int j=1;j<=col;j++){
				System.out.print(num-- +"\t");
			}
		
				System.out.println();
		}
	}
}
