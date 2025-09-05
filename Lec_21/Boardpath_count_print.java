package Assignment_4;

import java.util.Scanner;

public class Boardpath_count_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();			
		}
		
		
		int m=sc.nextInt();
		
		firstindex(n,m,arr,0);

	}
	public static void firstindex(int n,int m,int arr[],int index) {
		if(index==arr.length)
        {
            System.out.println("-1");
            return;
        }
		if(m==arr[index]) {
			System.out.print(index);
            return;
			
		}
		
		
		
			firstindex(n,m,arr,index+1);
			
		
		
		
		
		
		
	}

}