import java.util.*;
class Code6{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size=sc.nextInt();
		int count1=0;
		int count2=0;
		
		char  arr[]=new char [size];
		for(int k=0;k<size;k++){
			System.out.print("Enter character "+(k+1)+" : ");
			arr[k]=sc.next().charAt(0);
			System.out.println();
		}



		for(int k=0;k<size;k++){
			if(arr[k]=='a' ||arr[k]=='e'||arr[k]=='i'||arr[k]=='o'||arr[k]=='u'||arr[k]=='A'||arr[k]=='E'||arr[k]=='I'||arr[k]=='O'||arr[k]=='U'){
			count1++;
			}
			else{
				count2++;
			}
		}
		System.out.println("count of vowels: "+count1);
		System.out.println("count of consonants: "+count2);

		
}
}
