package homeworkOnFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Filemenu {
	public static void main(String[] args) throws IOException {
		menu();
		
		//use generics for this assignment 
		//file response object with string only
		/*File f = new File("/home/td/Desktop/Java/test10/flower.odt");
		f.createNewFile();
		FileOutputStream fos = new FileOutputStream(f);
		
		try {
		fos.write("Rose".getBytes());
		fos.write("\n".getBytes());
		fos.write("Tulip".getBytes());
		fos.write("\n".getBytes());
		fos.write("Lily".getBytes());
		}catch(Exception e) {
			
		}finally {
			fos.close();
		}
	}*/
	}

	static Scanner n = new Scanner(System.in);
	
		
		
	public static void menu() throws IOException {
		System.out.println("insert i  for insert");
		System.out.println("insert d  for delete");
		System.out.println("insert u  for update");
		System.out.println("insert r  for read all");
		System.out.println("insert rd  for read by id");
		System.out.println("insert e  for exit");
		String choice = n.next();
		if(choice.equalsIgnoreCase("i")) {
			insert();
		}
		else if(choice.equalsIgnoreCase("d")) {
			delete();
		}
		else if(choice.equalsIgnoreCase("u")) {
			update();
		}
		else if(choice.equalsIgnoreCase("r")) {
			readAll();
		}
		else if(choice.equalsIgnoreCase("rd")) {
			readById();
		}
		else if(choice.equalsIgnoreCase("e")) {
			exit();
		}
		
	}
	
		public static void insert() throws IOException {
			File f = new File("/home/td/Desktop/Java/test10/flower.odt");
			
			FileOutputStream fos = new FileOutputStream(f);
			System.out.println("insert flower's name ");
			Scanner m = new Scanner(System.in);
			String name = m.next();
			try {
			fos.write(name.getBytes());
			
			}catch(Exception e) {
				
			}finally {
				fos.close();
			}
			
		 
	}
	
	public static void delete() {
		
		
	}
	public static void update() {
		
	}
	public static void readAll() throws IOException {
		  FileReader fr=new FileReader("/home/td/Desktop/"
	          		+ "Java/test10/flower.odt");    
	          int i;    
	          while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
	          fr.close();    
		
	}
	public static void readById() {
		
	}
	public static void exit() {
		return;
	}
	
	
	
	
}
