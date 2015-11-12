import java.util.*;

class FilesCreation {
	public static void main(String args[]){
		final Formatter x;
		
		try{
			x = new Formatter("mack.txt");
			System.out.println("You created a file.");
		}
		catch (Exception e){
			System.out.println("You got an error named " + e);
		}
		
	}
	
}