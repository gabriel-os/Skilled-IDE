package FUNC;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Testes {
	public static void main(String args[]) {
		File file = new File("C:/Users/Gabriel/Documents");
		String[] directories = file.list(new FilenameFilter() {
		  @Override
		  public boolean accept(File current, String name) {
		    return new File(current, name).isDirectory();
		  }
		});
		System.out.println(Arrays.toString(directories));
		
	}
}
