package lesson7;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(
				"D:\\Learn-language-programming\\Java\\Javacore_VTI\\lesson_examples01\\src\\lesson7\\testFile.txt");
		try {
			if (file.exists()) {
				file.delete();
				file.createNewFile();
				System.out.println("Create file successfully");
			} else
				System.out.println("Create file fail");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
