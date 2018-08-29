import java.io.*;
import java.util.Scanner;
public class Zadaca9 {

	public static void main(String[] args) throws IOException {

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla: ");
		File file = new File(unos.nextLine());
		file.createNewFile();

		PrintWriter pw = new PrintWriter(file);
		
		String s = "";
		
		System.out.println("Unesite tekst($ za prekid unosa): ");
		
		while(s.equals("$")==false){
			s = unos.nextLine();
			if(s.equals("$")==false){
				pw.println(s);
			}
			pw.flush();
		}
		
		
		// pocetna velika slova
		BufferedReader br = new BufferedReader(new FileReader(file));
		String linija, novaLinija;
		char c;
		int a;
		while((linija = br.readLine()) != null) {
			novaLinija = "";	
			if(linija.charAt(0) > 96) {
				a = linija.charAt(0);
				c =  (char) (a - 32);
				novaLinija += c;
			}
			else
				novaLinija += linija.charAt(0);
			for (int i = 1; i < linija.length(); i++) {
				novaLinija += linija.charAt(i);
				if(linija.charAt(i) == ' ') {
					i++;
					a = linija.charAt(i);
					c =  (char) (a - 32);
					novaLinija += c;
				}
					
			}
				
			System.out.println(novaLinija);
	}
	}

}
