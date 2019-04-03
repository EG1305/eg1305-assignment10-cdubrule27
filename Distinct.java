import java.util.Scanner;
public class Distinct {
	public static void main(String[] args) { 
		Scanner input = new Scanner (System.in);
		int[] array=new int[10];
		for(int i=0;i<10;i++) {
			System.out.println("Enter integer "+(i+1)+":");
			array[i]=input.nextInt();
		}
		System.out.println("Distinct numbers are:");
		showDistinct(array,array.length);
	}
	public static void  showDistinct(int[] a,int n) {
		 for (int i = 0; i < n; i++) 
	        { 
	           
	            int j; 
	            for (j = 0; j < i; j++) 
	            if (a[i] == a[j]) 
	                break; 
	      
	           
	            if (i == j) 
	            System.out.print( a[i] + " "); 
	        } 
	}
}
