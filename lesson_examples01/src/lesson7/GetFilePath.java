package lesson7;

import java.io.File;

public class GetFilePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\");
		for (File files : file.listFiles()) {
			System.out.println(files.getAbsolutePath());
		}
	}

}
