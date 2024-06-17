import java.io.*;
class code2{
	public static void main(String [] arg)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter row: ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			for (int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

