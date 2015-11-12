import java.util.*;

class ExceptionHandlingProg{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int x = 1;
		
		do{
			try{
				System.out.print("\nEnter First no: ");
				int n1 = input.nextInt();
				System.out.print("\nEnter Second no: ");
				int n2 = input.nextInt();
				int ans = n1/n2;
				System.out.println("\nAnswer = "+ans);
				x=2;
			}
			
			catch(Exception e){
				System.out.println("You can't do that");
			}			
		}while(x==1);
	}
}