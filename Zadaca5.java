import java.io.*;
import java.util.Scanner;
public class Zadaca5 {

	public static void main(String[] args) throws IOException {
	
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite ime fajla: ");
		File file = new File(unos.nextLine());
		file.createNewFile();
		
		
		String string = "";
		
		//upis
		PrintWriter output = new PrintWriter(file);
		
		System.out.println("Unosite stringove ($ prekida unos): ");
		while (string.equals("$") == false){
			string = unos.next();
			if (string.equals("$") == false)
			output.print(string + " ");
		}
		
		output.close();
		
		Scanner input = new Scanner(file);
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			String skraceniLine = "";
			if (line.length() < 55) {
				System.out.println(line);
			} else {
				for (int i = 0; i < 40; i++) {
					skraceniLine += line.charAt(i);
				}
				System.out.println(skraceniLine + "... <Read More>");
			}
		}
		input.close();
		unos.close();

	}

}
