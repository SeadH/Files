import java.io.*;
import java.util.Scanner;
public class Zadaca6 {

	public static void main(String[] args) throws IOException {

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla: ");
		File file = new File(unos.nextLine());
		file.createNewFile();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		//najduza rijec
		
		
		FileOutputStream fos = new FileOutputStream(file);

		
		
		PrintWriter pw = new PrintWriter(file);
		Scanner input = new Scanner(file);
		String st = "";
		
		System.out.println("Unesite string ( exit za prekid unosa): ");
		
		while(st.equals("exit")==false){
		st=unos.nextLine();
		if (st.equals("exit") == false)
			pw.println(st);
		}
		pw.close();
		
		String line, rijec, najduza;
		
		while((line = br.readLine()) != null) {
			rijec = "";
			najduza = "";
			for (int i = 0; i < line.length(); i++) {
				if(line.charAt(i) != ' ') 
					rijec += line.charAt(i);
				else {
					if(rijec.length() > najduza.length())
						najduza = rijec;
					rijec = "";
				}
			}
		
			System.out.println("najduža rijeè je: "+najduza);
		}
		
		br.close();
	}
	
		
	}


