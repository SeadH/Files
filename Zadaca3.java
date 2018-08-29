import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Zadaca3 {

	public static void main(String[] args) throws Exception {

		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("test.txt");

		BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);

		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite tekst ($ za prekid unosa): ");
		char ch;

		while ((ch = (char) dis.read()) != '$') {
			bos.write(ch);

		}
		bos.close();

		FileInputStream fis = new FileInputStream("test.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		System.out.println("Fajl sadrži: ");
		String data = readFileAsString("‪C:\\Users\\PC\\workspace\\FileZadaca3\\test.txt");
		System.out.println(data);

		String reverse = new StringBuffer(data).reverse().toString();
		//String rev = reverse.trim();
		System.out.print(reverse);

	}

	public static String readFileAsString(String fileName) throws Exception {
		String data = "";
		data = new String(Files.readAllBytes(Paths.get("test.txt")));
		return data;
	}

}
