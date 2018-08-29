import java.io.*;
import java.util.Scanner;

public class Zadaca7 {

	public static void main(String[] args) throws IOException {

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla: ");
		File file = new File(unos.nextLine());
		file.createNewFile();
		
		PrintWriter writer = new PrintWriter(file);

		
		String tekst ="";
		System.out.println("Unesite tekst ($ prekida unos): ");
		
	
		while(tekst.equals("$") == false){
			tekst=unos.nextLine();
			if(tekst.equals("$") ==false){
				writer.println(tekst);
			
			}
				writer.flush();
			
		}
		
		//predzadnja rijec
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String linija, rijec, predzadnja;
		while((linija = br.readLine()) != null) {
			rijec = "";
			predzadnja = "";
			int brojacSpaceova = 0;
			for (int i = linija.length()-1; i >= 0; i--) {
				if(linija.charAt(i) == ' ') {
					brojacSpaceova++;
					if(brojacSpaceova >= 2)
						break;
					rijec = "";
				}
				else
					rijec += linija.charAt(i);
			}
			for (int i = rijec.length()-1; i >= 0; i--) {
				predzadnja += rijec.charAt(i);
			}
			System.out.println(predzadnja);
		}
		
		br.close();
	}
		
		
		
	}
	

