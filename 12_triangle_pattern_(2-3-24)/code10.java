import java.util.*;
class code10{
	public static void main(String[] arg){
		int num=1;
		char ch='a';
		Scanner sc=new Scanner (System.in);
		System.out.print("enter row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(num+ " ");
				}
				else{
					System.out.print(ch+ " ");
				}
		

				ch++;
				num++;
			}
					System.out.println();
			
		}
	}
}


