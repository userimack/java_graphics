import java.io.File;

class FilesExistenceCheck {
	public static void main(String[] args){
		File x = new File("D:\\mtest.txt");
		
		if(x.exists())
			System.out.println(x.getName() + " exists!");
		else
			System.out.println(x.getName()+" This thing doesn't exists");
	}
}