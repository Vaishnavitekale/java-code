import java.util.*;
class Code6{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
		int num=row;
			for(int j=1;j<=row*2-1;j++){
				if(i+j<=row || j-i>=row){
					System.out.print(" "+"\t");
				}
				else{
					if(j>=row){
					System.out.print(num+++"\t");
				}
				else{
					System.out.print(num--+"\t");
				}

			}
			}
					System.out.println();
		}
	}
}

