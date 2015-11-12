import java.io.*;
import java.lang.*;
import java.util.*;

class CreateFile {
	private Formatter x;
	
	void openFile() {
		try {
			x = new Formatter("chinese.txt");
		}
		catch(Exception e){
			System.out.println("You have an error");
		}
	}
	
	void addRecords(){
		x.format("%s%s%s\n","20 ","mack ","raw  ");
		x.format("%s%s%s\n","20 ","imack ","null  ");
		x.format("%s%s%s\n","20 ","userimack "," null ");
		x.format("%s%s%s\n","20 ","mahendra ","yadav  ");
	}
	void closeFile(){
		x.close();
	}
}

class WritingToFiles{
	public static void main(String[] args){
		CreateFile c = new CreateFile();
		c.openFile();
		c.addRecords();
		c.closeFile();
	}
}