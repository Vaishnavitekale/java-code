import java.util.*;
class Code6{
	public static void main(String [] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		int col=0;
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

			}
			else{
				col=i;
				
			}
			for(int j=1;j<=col;j++){
				System.out.print(j +"\t");
			}
		
				System.out.println();
		}
	}
}
