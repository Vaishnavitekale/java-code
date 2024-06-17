import java.io.*;
class code7{
	public static void main(String[] arg)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row : ");
		int row=Integer.parseInt(br.readLine());
		int num=row;
		for(int i=1;i<=row;i++){
				for(int j=row;j>=i;j--){
					System.out.print(num +" ");
				}
				num--;
		System.out.println();
		}
	}
}
