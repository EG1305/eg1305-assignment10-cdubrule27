import java.util.Scanner;
import java.util.Random;
public class Lottery {
	public static void main(String[] args) { 
		 Random rd = new Random(); 
	      int[] arr = new int[5];
	      int[] user;
	     
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = Math.abs(rd.nextInt()%10);
	          }
	      user=getValues();
	      System.out.print("The lottery numbers are: ");
	      for (int i = 0; i < arr.length; i++) {
		         System.out.print(arr[i]+" ");
		          }
	      System.out.println(" ");
	      compareNumbers(user,arr);
	      
	      
		
	}
public static int[] getValues() {
	Scanner input = new Scanner (System.in);
	int[] user = new int[5];
	System.out.println("Enter a series of 5 numbers");
	for(int i =0;i<5;i++) {
		System.out.println("Enter number "+(i+1)+":");
		user[i]=input.nextInt();
	}
	return user;
}
public static void compareNumbers(int[] user,int[] lot) {
	int matches=0;
	int[] same=new int[5];
	
	for(int i=0;i<5;i++) {
		if(user[i]==lot[i]) {
			matches++;
			same[(matches-1)]=user[i];
			
		}
	}
	System.out.println("you matched "+matches+" number(s)");
	if(matches==5)
		System.out.println("You won the lottery!!");
	if(matches>0) {
		System.out.print("Your matching numbers are: ");
		for(int c=0;c<matches;c++)
			System.out.println(same[c]+" ");
	}
	
	
}
}
