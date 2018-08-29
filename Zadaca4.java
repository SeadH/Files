import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Zadaca4 {

	public static void main(String[] args) throws IOException {

		//Deklaracija i inicijalizacija promjenjljivih
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla: ");
		File file = new File(unos.nextLine());
		file.createNewFile();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String string = "";
		
		//upis
		PrintWriter output = new PrintWriter(file);
		
		System.out.println("Unosite stringove ($ prekida unos): ");
		while (string.equals("$") == false){
			string = unos.nextLine();
			if (string.equals("$") == false)
			output.print(string + " ");
		}
		
		output.close();
		
		
		Scanner input = new Scanner(file);
		
		
		ArrayList<String> rijeci = new ArrayList<>();
		while (input.hasNext()) {
			string = input.next();
			rijeci.add(string);
		}

		input.close();

		for (int i = rijeci.size() - 1; i >= 0; i--) {
			System.out.print(rijeci.get(i) + " ");
		}
		unos.close();
		
//		//Citanje teksta iz fajla i ispisivanje recenica unazad
//		String linija, rijec;
//		while((linija = br.readLine()) != null) {
//			listaRijeci.clear();
//			rijec = "";
//			for (int i = 0; i < linija.length(); i++) { //Ova petlja izdvaja rijeci iz citave linije
//				if(linija.charAt(i) != ' ')
//					rijec += linija.charAt(i);
//				else {
//					listaRijeci.add(rijec);
//					rijec = "";
//				}
//			}
//			listaRijeci.add(rijec);
//			for (int i = listaRijeci.size()-1; i >= 0; i--) { //Ova petlja ispisuje rijeci u obrnutom redosljedu
//				System.out.print(listaRijeci.get(i)+" ");			
//			}
//			//System.out.println(listaRijeci.get(0));
//			System.out.println();
//		}
//		
//		br.close();
	}

}
