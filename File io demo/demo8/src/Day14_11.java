import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// try with resources 
// read a single byte from text file (FileReader)
// write a single byte to the text file (FileWriter)

public class Day14_11 {

	static Scanner sc = new Scanner(System.in);
	static String pathname = "Demo.txt";
	
	static void writeRecord() throws IOException
	{
		try(FileWriter fw = new FileWriter(new File(pathname));)
		{
			byte data = 123;
			fw.write(data);
			System.out.println("Data is written inside the file");
		}
	} //end of writeRecord 
	
	static void readRecord() throws IOException
	{
		try(FileReader fr = new FileReader(new File(pathname));)
		{
			System.out.println("Data read from the file = "+fr.read());
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
