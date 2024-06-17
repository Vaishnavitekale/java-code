import java.util.*;
class Code3{
	public static void main(String[] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		int ch=row;
		int ch2=96+row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if((i+j)%2==1){
					System.out.print(ch+" ");
				}
				else{
					System.out.print((char)(ch2)+" ");
				}
				ch++;
				ch2++;
			}
			System.out.println();
		}
	}
}
