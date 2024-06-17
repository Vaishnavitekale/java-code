import java.util.*;
class Code4{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter row: ");
		int row=sc.nextInt();
		int num=65;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row*2-1;j++){
				if(i+j<=row || j-i>=row){
					System.out.print(" "+"\t");
				}
				else{
					System.out.print((char)num+"\t");
				}
			}
					num++;
					System.out.println();
		}
	}
}

