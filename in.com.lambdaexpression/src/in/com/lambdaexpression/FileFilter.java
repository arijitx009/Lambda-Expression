package in.com.lambdaexpression;

import java.io.File;

public class FileFilter {
	public static void main(String[] args) {
		File file=new File("Arijit");
		//using file filter with lambda expression
		File listOfFolder[]=file.listFiles((fileElement)->{return fileElement.isDirectory();});
		//iterating through each file element
		for(File eachFile: listOfFolder)
		{
		System.out.println(eachFile.getName());
		}
		}
		}

