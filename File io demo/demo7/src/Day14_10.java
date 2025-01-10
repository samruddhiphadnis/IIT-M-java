import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
// try with resources 
// read primitive data from binary file (DataInputStream)
// write primitive data to the binary file (DataOutputStream)

public class Day14_10 {

	static Scanner sc = new Scanner(System.in);
	static String pathname = "Test.dat";
	
	static void writeRecord() throws IOException
	{
		try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(pathname))));)
		{
			String name="Akshita";
			int age = 36;
			float salary = 80000;
			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeFloat(salary);
			
		}
	} //end of writeRecord 
	
	static void readRecord() throws IOException
	{
		try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(pathname))));)
		{
				System.out.println("Name = "+dis.readUTF());
				System.out.println("Age = "+dis.readInt());
				System.out.println("Salary = "+dis.readFloat());
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
