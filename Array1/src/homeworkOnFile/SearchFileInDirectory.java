package homeworkOnFile;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SearchFileInDirectory {
	// client will give the file name and program has to tell whether
	// the file exists and which folder
	// search files
	public static void main(String[] args) {
		search("/home/td/Desktop/Java/test10", "rose.odt");
	}

	public static void search(String dir, String name) {
		// creating file object to perform some file operations
		File f = new File(dir);
		// joining directory and file name by calling paths.get() which takes
		// directory name and file name
		Path filePath = Paths.get(dir, name);
		File f2 = new File(filePath.toString());
		// f.listFiles();
		boolean resdir = f.isDirectory();
		boolean resFile = f2.isFile();

		//System.out.println(resdir);
		//System.out.println(resFile);
		boolean found = false;
		if (resdir == true && resFile == true) {
			for (String n : f.list()) {
				// System.out.println(n);
				if (n.equals(name)) {
					System.out.println("found " + name + " in " + f.getParent());
					//found = true;
				}
			}

		}else
		//if(!found) {
			System.out.println("it is not a directory or a file");
		//}
		
	}

}
