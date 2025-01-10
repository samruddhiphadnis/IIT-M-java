import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
// try with resources 
// read a single byte from binary file (FileInputStream)
// write a single byte to the binary file (FileOutputStream)

public class Day14_8 {

	static Scanner sc = new Scanner(System.in);
	static String pathname = "Test.dat";
	
	static void writeRecord() throws IOException
	{
		try(FileOutputStream fos = new FileOutputStream(new File(pathname));)
		{
			byte data = 123;
			fos.write(data);
			System.out.println("Data is written inside the file");
		}
	} //end of writeRecord 
	
	static void readRecord() throws IOException
	{
		try(FileInputStream fis = new FileInputStream(new File(pathname));)
		{
			System.out.println("Data read from the file = "+fis.read());
		}
	} //end of readRecord
	
	static int menuList()
	{
		System.out.println("Enter your choice : ");
		System.out.println("0.Exit 1.Write 2.Read");
		return sc.nextInt();
	}
	
	public static void main(String[] args) throws IOException 
	{
		int choice;
		while((choice = menuList())!=0)
		{
			switch(choice)
			{
			case 1:
				writeRecord();
				break;
			case 2:
				readRecord();
			break;
				
			} //end of switch 
		} //end of while block 
		
	} //end of main

} //end of class
