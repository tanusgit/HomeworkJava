package homeworkOnFile;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SearchFileInDirectory {
	// client will give the file name and program has to tell whether
	// the file exists and which folder
	// search files
	public static void main(String[] args) {
		//search("initrd.img");
		searchHelper("/home/td/Desktop/Java", "flower.odt");
	}
	
	
	public static void searchHelper(String dir, String name) {
		File f2 = new File(dir);
		//System.out.println(f2.isDirectory());
		File f3 = new File(name);
		//System.out.println(f3.isFile());
	boolean found = false;
		//list all the files and directories with their full path
		for(File n: f2.listFiles()) {
		//	System.out.println(n);
			//n is file so we need to call toString() to make it a string to compare with
			//file name
			if(n.isFile() && n.toString().contains(name)) {
				System.out.println("found in " + n.toString());
				found = true;
			}
			else if(n.isDirectory()) {
				searchHelper(n.toString(), name);
			}
			
		}
		if(!found){
			//System.out.println("not found");
		}
		
	}
	
	
	

	public static void search(String name) {
try {
		// creating file object to perform some file operations
		File f3 = new File(name);
		System.out.println(f3.isFile());
		System.out.println(f3.getParentFile());

		// searching for the root directory of any computer
		File[] fr = f3.listRoots();
		boolean found = false;
		for (File m1 : fr) {
			// printing root
			System.out.println(m1);
			// checking if root is a directory
			// System.out.println(m1.isDirectory());
			// taking all the files or directories in the root
			String n[] = m1.list();
			for (String k : n) {
				// k is all the directories in the root directory
				// System.out.println(k);

				Path pathf = Paths.get(m1.toString(), k);
				File directory = new File(pathf.toString());
				boolean res = directory.isDirectory();
				// System.out.println(directory+ " " + res );
				long l = directory.length();

				if (directory.isFile()) {
					if (k.equals(name)) {
						System.out.println("found:  " + name);
						found = true;
					}
				}


			}
			if (!found) {
				System.out.println("not found ");
			}
		}
	}catch(Exception e) {
		
	}
}
}

/*
 * 
 * if (directory != null) { System.out.println(directory.list().toString()); }
 * 
 * creating file objects for all the directories or files in //the root by
 * adding the path of the file with the root's //directory's path, otherwise
 * computer won't understand //that it is a file/directory in the root
 * directory. we must give //the complete path to the computer. So we are
 * creating path by //joining the path of root and the file
 * System.out.println(k); Path pathf = Paths.get(m1.toString(), k); File
 * directory = new File(pathf.toString()); boolean res =
 * directory.isDirectory(); System.out.println(pathf.toString()+ " " + res );
 * //System.out.println(directory); for (String eachFile : directory.list()) {
 * //System.out.println("files in " + directory + " " //+eachFile); } //first
 * root -> home -> td -> desktop -> java ->test10 if (k.equals(name)) {
 * System.out.println("found " + name + " in " + k); found = true; } }
 * if(!found) { System.out.println("did not find " + name); } } }catch(Exception
 * e) {
 * 
 * } /*joining directory and file name by calling paths.get() which takes //
 * directory name and file name Path filePath = Paths.get(dir, name); File f2 =
 * new File(filePath.toString()); // f.listFiles(); boolean resdir =
 * f.isDirectory(); boolean resFile = f2.isFile(); File[] files = f.listRoots();
 * for (File m : files) { System.out.println(m); }
 * 
 * // System.out.println(resdir); // System.out.println(resFile);
 * 
 * if (resdir == true && resFile == true) { for (String n : f.list()) { //
 * System.out.println(n); if (n.equals(name)) { System.out.println("found " +
 * name + " in " + f.getParent()); found = true; } }
 * 
 * } if (!found) { System.out.println("it is not a directory or a file"); } if
 * (resdir == true && resFile == true && !found) { search(f.getParent(), name);
 * 
 * File[] files = f.listRoots(); for(File m : files) { System.out.println(m); }
 */
