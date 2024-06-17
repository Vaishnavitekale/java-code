import java.util.*;
class Code3{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roe: ");
		int row=sc.nextInt();
		int num=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i+j>row){
					System.out.print(num+"          ");
					num+=row;
				}
				else{
					System.out.print("           ");
				}
			}
					System.out.println();
			}
	}
}

				


