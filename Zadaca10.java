import java.io.*;
import java.util.Scanner;
public class Zadaca10 {

	public static void main(String[] args) throws IOException {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite ime fajla: ");
		File file = new File(unos.nextLine());
		file.createNewFile();
		
		PrintWriter pw = new PrintWriter(file);
		String s = "";
		
		System.out.println("Unesite koliko brojeva zelite  generisati: ");
		int n = unos.nextInt();
		
		//generisati
	
		for(int i = 0; i<n; i++){
			int broj = (int) (Math.random()*100+1);
			
			pw.println(broj);
		}
		
		pw.flush();
		

		//neparani
		BufferedReader br = new BufferedReader(new FileReader(file));
		Scanner input = new Scanner(file);
		
		while(input.hasNext()){
			int broj = input.nextInt();
			if(broj % 2 == 1){
				System.out.print(broj+" ");
			}
		}
	}
}
