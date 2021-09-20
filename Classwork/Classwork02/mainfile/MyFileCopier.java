package mainfile;
import java.util.Scanner;
import copiersupport.SourceFile;


public class MyFileCopier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please provide the file name");
		Scanner myInput = new Scanner( System.in );
		String Name = myInput.nextLine();
		SourceFile input = new SourceFile();
		input.setName(Name);
		

	}

}
