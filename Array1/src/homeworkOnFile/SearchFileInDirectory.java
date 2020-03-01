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
		File f3 = new File(name);
		File[] fr = f3.listRoots();
		boolean found = false;
		for (File m1 : fr) {
			//printing root
			System.out.println(m1);
			//checking if root is a directory
			//System.out.println(m1.isDirectory());
			//taking all the files or directories in the root
			String n [] = m1.list();
			for(String k : n) {
				//creating file objects for all the directories or files in the root
				//File directory = new File(k);
				Path pathf = Paths.get(m1.toString(), k);
				File directory = new File(pathf.toString());
				boolean res = directory.isDirectory();
				System.out.println(pathf.toString()+ " " + res );
				if (k.equals(name)) {
					System.out.println("found " + name + " in " + f.getParent());
					found = true;
				}
			}
			if(!found) {
				System.out.println("did not find " + name);
			}
		}
		
		 /*joining directory and file name by calling paths.get() which takes
		// directory name and file name
		Path filePath = Paths.get(dir, name);
		File f2 = new File(filePath.toString());
		// f.listFiles();
		boolean resdir = f.isDirectory();
		boolean resFile = f2.isFile();
		File[] files = f.listRoots();
		for (File m : files) {
			System.out.println(m);
		}

		// System.out.println(resdir);
		// System.out.println(resFile);
	
		if (resdir == true && resFile == true) {
			for (String n : f.list()) {
				// System.out.println(n);
				if (n.equals(name)) {
					System.out.println("found " + name + " in " + f.getParent());
					found = true;
				}
			}

		}
		if (!found) {
			System.out.println("it is not a directory or a file");
		}
		if (resdir == true && resFile == true && !found) {
			search(f.getParent(), name);
			
			 * File[] files = f.listRoots(); for(File m : files) { System.out.println(m); }
			 */
		}

	}


