package copiersupport;


import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
// import TargetFile;

public class SourceFile {

	public String name;
	public FileReader in = null;

	public void setName(String newName) {
		this.name = newName;
		//StringBuilder everything = new StringBuilder();
		//BufferedReader br = new BufferedReader(new FileReader(name));
		try {
		 //in  = new FileReader(name);
		//out = new FileWriter("output.txt");
		StringBuilder everything = new StringBuilder();
		BufferedReader br = new BufferedReader(new FileReader(name));
		String line;
		while ((line = br.readLine()) != null) {
			//TargetFile output = new TargetFile();
			everything.append(line + "\n");
		}
		String singleString = everything.toString();
		TargetFile output = new TargetFile(name, singleString);
		output.writeAll();

		}catch( Exception ioe ) {
			ioe.printStackTrace();
                         System.out.println( "\n  Sorry, an I/O error occurred1." );
		}
	}



}
