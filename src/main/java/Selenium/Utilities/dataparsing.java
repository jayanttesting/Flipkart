package Selenium.Utilities;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class dataparsing {

	public static List<String> readusingfilereader(String filename) throws IOException {
		File file = new File(filename);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		System.out.println("Reading text file using filereader");
		List<String> str = new ArrayList<>();
		while ((line = br.readLine()) != null) {

			str.add(line);
		}
		br.close();
		return str;
	}

	@SuppressWarnings("static-access")
	public static String userid() throws IOException {
		dataparsing parse = new dataparsing();
		List<String> resultlist = parse.readusingfilereader(System.getProperty("user.dir")+"//Resources//testdata.txt");
		return resultlist.get(0);
	}
	public static String password() throws IOException {
		@SuppressWarnings("unused")
		dataparsing parse = new dataparsing();
		List<String> resultlist = dataparsing.readusingfilereader(System.getProperty("user.dir")+"//Resources//testdata.txt");
		return resultlist.get(1);
	}

}
