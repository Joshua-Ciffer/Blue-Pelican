// Joshua Ciffer 11/17/2017 //

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class FileParser {

	public static void main(String[] args) throws FileNotFoundException {

		File textFile = new File("C:\\Users\\Joshua\\Desktop\\File.txt");
		FileOutputStream out = new FileOutputStream(textFile);
		PrintStream print = new PrintStream(out);
		
		
		Scanner scanner = null;
		File txt = new File("E:\\Data.in");
		ArrayList<String> list = new ArrayList<>();
		try {
			scanner = new Scanner(txt);
			try {
				int i = 0;
				while (scanner.hasNext()) {
					list.add(i, scanner.next());
					System.out.println(i + list.get(i));
					i++;
				}
			} catch (InputMismatchException e) {
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			for (String x : list) {
				System.out.println(x);
			}
			scanner.close();
			txt.renameTo(new File("E:\\Date.in"));
			txt.delete();

		}
	}

}
