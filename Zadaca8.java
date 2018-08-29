import java.io.*;
import java.util.Scanner;
public class Zadaca8 {

	public static void main(String[] args) throws IOException {
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla: ");
		File file = new File(unos.nextLine());
		file.createNewFile();
		
		PrintWriter pw = new PrintWriter(file);
		String s = "";
		
		System.out.println("Unesite tekst($ za prekid unosa): ");
		while(s.equals("$")==false){
			s=unos.nextLine();
			if(s.equals("$")==false){
				pw.println(s);
			}
			pw.flush();
		}
		
		// bez razmaka
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String linija, novaLinija;
		while((linija = br.readLine()) != null) {
			novaLinija = "";
			for (int i = 0; i < linija.length(); i++) {
				if(linija.charAt(i) != ' ')
					novaLinija += linija.charAt(i);
			}
			System.out.println(novaLinija);
		}
		
		br.close();
		
	}

}
