import java.io.File;
import java.io.IOException;

// fetching the list of files inside the directory

public class Day14_5 {

	public static void main(String[] args) throws IOException
	{
	
		String pathname = "C:\\Users\\sunbeam\\Desktop\\Code\\DAY14\\Day14_3";
		File fobj = new File(pathname);
		File farr[]=fobj.listFiles();
		for(File f : farr)
			System.out.println(f.getName());
	}
}


/*
// Fetching the meta data (information) of the file 

public class Day14_5 {

	public static void main(String[] args) throws IOException
	{
	
		String pathname = "C:\\Users\\sunbeam\\Desktop\\Code\\DAY14\\Day14_3\\src\\Day14_3.java";
		File fobj = new File(pathname);
		System.out.println("Get Name = "+fobj.getName());
		System.out.println("Get Parent = " +fobj.getParent());
		System.out.println("Absolute path = "+fobj.getAbsolutePath());
		System.out.println("Canonical Path  = "+fobj.getCanonicalPath());
		System.out.println("Get Path = "+fobj.getPath());
		System.out.println("Is it file ??"+fobj.isFile());
		System.out.println("Is it Directory ?? "+fobj.isDirectory());
		System.out.println("Is it hidden file ? "+fobj.isHidden());
		System.out.println("is is existing ? "+fobj.exists());
		System.out.println("Length = "+fobj.length());
		System.out.println("Last modified = "+fobj.lastModified());
		
		

	}

}
*/