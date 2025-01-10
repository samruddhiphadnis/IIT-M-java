import java.io.File;
import java.io.IOException;
//delete a directory / folder
public class Day14_4 {

	public static void main(String[] args) 
	{
		String pathname = "Demo";
		File fobj = new File(pathname);
		boolean status = fobj.delete();
		System.out.println("Status = "+status);
	}
}





/*
//create a directory(folder)
public class Day14_4 {

	public static void main(String[] args) 
	{
		String pathname = "Demo";
		File fobj = new File(pathname);
		boolean status = fobj.mkdir();
		System.out.println("Status = "+status);
	}
}

*/

//delete a file

/*
public class Day14_4 {

	public static void main(String[] args) 
	{
		String pathname = "test.dat";
		File fobj = new File(pathname);
		boolean status = fobj.delete();
		System.out.println("Status = "+status);
	}
}

*/
/*
// creating a new file
// createNewFile() method from File class

public class Day14_4 {

	public static void main(String[] args) 
	{
		String pathname = "test.dat";
		File fobj = new File(pathname);
		try
		{
			boolean status = fobj.createNewFile();
			System.out.println("Status = "+status);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		

	}

}
*/
