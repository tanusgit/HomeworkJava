package homeworkOnFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchWithFile {
	
		public static void main(String[] args) {
			//working properly
			//search("initrd.img");
			//searchHelper("/home/td/Desktop/Java", "flower.odt");
			//searchHelper("/home", "flower.odt");
			List<String> names = new ArrayList<>();
			
			searchHelper("/home", "flower.odt", names);
			
			
			if(names.isEmpty()) {
				System.out.println("file not found");
			}
			else {
				for(String n: names) {
					System.out.println(n);
				}
			}
			//search("flower.odt");
			
		}
		
		
		public static void search(String name) {
			try {
			File f3 = new File(name);
			File[] fr = f3.listRoots();
			for(File f : fr) {
				//searchhelper() take a directory name and a file name
				searchHelper(f.toString(), name, null);
			}
			}catch(Exception e) {
				System.out.println("program crashed");
			}
		}
		
		
		
		public static void searchHelper(String dir, String name, List names) {
			File f2 = new File(dir);
			File f3 = new File(name);

			//list all the files and directories with their full path
			for(File n: f2.listFiles()) {
			//	System.out.println(n);
				//n is file so we need to call toString() to make it a string to compare with
				//file name
				if(n.isFile() && n.toString().contains(name)) {
				 names.add(n.toString());
					
				}
				else if(n.isDirectory()) {
					searchHelper(n.toString(), name, names);
				}				
			}
			
			
		}

	

}
