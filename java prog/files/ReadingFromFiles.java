import java.io.*;
import java.util.*;

class ReadFile{
	private Scanner x;
	
	void openFile(){
		try{
			x = new Scanner(new File("chinese.txt"));
			
		}
		catch(Exception e){
			System.out.println("Could not find file");
		}		
	}
	
	void ReadFile(){
		while(x.hasNext()){
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			System.out.printf("%s %s %s\n",a,b,c);
		}
	}
	
	void closeFile(){
		x.close();
	}
}

class ReadingFromFiles {
	public static void main (String[] args){
		ReadFile r = new ReadFile();
		r.openFile();
		r.ReadFile();
		r.closeFile();
	}
}