import java.util.*;
class Code2{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		int num=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i==j||j>i){
					System.out.print(num+"          ");
					num++;
					
				}
				else{
					System.out.print("           ");
				}
			}
			num--;
					System.out.println();
			}
	}
}

				

