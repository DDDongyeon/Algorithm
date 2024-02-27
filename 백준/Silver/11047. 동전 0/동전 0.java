import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int[] a=new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		int count=0;
		for (int i = n-1; i >= 0; i--) {
			if(a[i]<=k) {
				count=count+(k/a[i]);
				k=k%a[i];
			}
		}
		System.out.println(count);
	}

}