package lesson7;

import java.io.File;

public class CheckFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\Learn-language-programming\\Java\\Javacore_VTI\\lesson_examples01\\src\\lesson7\\testFile.txt");
		if(file.exists())
			System.out.println("File is exists");
		else
			System.out.println("File is not exists");
	}

}
