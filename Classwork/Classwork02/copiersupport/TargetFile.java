package copiersupport;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TargetFile{

	public String name;
	public String line;

	public TargetFile(String name, String everything){
		this.name = name;
		this.line = everything;
	}

	public void writeAll() throws Exception {
		//java.io.FileWriter out = null;
		 try (FileWriter fw = new FileWriter(this.name + ".copy")) {
		    fw.write(line);
	}
	}

}
