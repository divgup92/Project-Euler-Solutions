package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {

	public static String read(String fileName) throws FileNotFoundException, IOException {
		File file = new File("./files/"+fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;
		StringBuilder sb = new StringBuilder();
		while ((str = br.readLine()) != null)
			sb.append(str);
		return sb.toString();
	}
}
