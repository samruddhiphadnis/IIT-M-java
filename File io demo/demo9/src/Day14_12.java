

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// try with resources 
// read multiple from text file (BufferredReader)
// write multiple bytes to the text file (BufferredWriter)

public class Day14_12 {

	static Scanner sc = new Scanner(System.in);
	static String pathname = "Demo.txt";
	
	static void writeRecord() throws IOException
	{
		try(BufferedWriter bw =new BufferedWriter(new FileWriter(new File(pathname)));)
		{
			for(char ch='A';ch<='Z';ch++)
				bw.write(ch);
			System.out.println("Data is written inside the file");
		}
	} //end of writeRecord 
	
	static void readRecord() throws IOException
	{
		try(BufferedReader br =new BufferedReader(new FileReader(new File(pathname)));)
		{
			int data;
			while((data = br.read())!=-1)
				System.out.print((char)data+"\t");
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
