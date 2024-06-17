import java.util.*;
class Code9{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
		int num=65;
		int num2=97;
			for(int j=1;j<=row*2-1;j++){
				if(i+j<=row || j-i>=row){
					System.out.print(" "+"\t");
				}
				else{
					if(i%2==0){
						if(j>=row){
						System.out.print((char)num2--+"\t");
						}
						else{
						System.out.print((char)num2+++"\t");
						}

					}
					else{
						if(j>=row){
						System.out.print((char)num--+"\t");
						}
						else{
						System.out.print((char)num+++"\t");
						}

					}
				}
			}
					System.out.println();
		}
	}
}

