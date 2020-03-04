package fileMenuwithoutGeneric;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Filemenu {
	public static void main(String[] args) throws IOException {
		menu();
		
		//use generics for this assignment 
		//file response object with string only
	/*	File f = new File("/home/td/Desktop/Java/test10/Person.odt");
		f.createNewFile();
		FileOutputStream fos = new FileOutputStream(f);
		//BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));
		
		Person p = new Person(1, 23, "Nim");
		Person p1 = new Person(2, 27, "Rim");
		Person p2 = new Person(3, 26, "jim");
		Person p3 = new Person(4, 24, "kim");
		
		try {
		fos.write(p.toString().getBytes());
		fos.write("\n".getBytes());
		fos.write(p1.toString().getBytes());
		fos.write("\n".getBytes());
		fos.write(p2.toString().getBytes());
		fos.write("\n".getBytes());
		fos.write(p3.toString().getBytes());
		fos.write("\n".getBytes());
		
		}catch(Exception e) {
			
		}finally {
			fos.close();
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
	//create a file for every person
	//having multiple files is an advantage
	//no need to search all the person objects in one file
		public static void insert() throws IOException {
			File f = new File("/home/td/Desktop/Java/test10/Person.odt");
			
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
	          		+ "Java/test10/Person.odt");    
	          int i;    
	          while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
	          fr.close();    
		
	}
	public static void readById() throws IOException {
		  FileReader fr=new FileReader("/home/td/Desktop/"
	          		+ "Java/test10/Person.odt");    
	          int i;    
	          
	          while((i=fr.read())!=-1) {   
	          //System.out.print((char)i);  
	        	  
	          }
	          fr.close(); 
		
	}
	public static void exit() {
		return;
	}
	
	
	
	
}
