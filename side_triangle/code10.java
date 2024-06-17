import java.util.*;
class Code10{
	public static void main(String [] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		int col=0;
		int num=0;
		for(int i=1;i<row*2;i++){
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
				num=65+row-col;

			}
			else{
				col=i;
				num=65+row-i;
				
			}
			for(int j=1;j<=col;j++){
				System.out.print((char)num++ +"\t");
			}
		
				System.out.println();
		}
	}
}
