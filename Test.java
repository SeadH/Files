import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) throws Exception{
		
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("test.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite tekst ($ za prekid unosa): ");
		char ch;
		
		while( (ch=(char)dis.read())!= '$'){
			bos.write(ch);
		
		
		}
		bos.close();
		
		FileInputStream fis = new FileInputStream("test.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
//		System.out.println("Fajl sadrži: ");
//		int c;
//		
//		while((c=bis.read())!=-1){
//			System.out.print((char)c);
//			
//		}
		
		
		System.out.println("Fajl sadrži: ");
		String data = readFileAsString("‪C:\\Users\\PC\\workspace\\FileZadaca1\\test.txt");
	    System.out.println(data);
		
		bis.close();
		
		System.out.print("Broj karaktera u datom fajlu je: ");
		System.out.println(data.length()-2);
		System.out.println("Broj riječi u tekstu: "+brojRijeci(data));
		System.out.println("Broj karaktera(bez razmaka) u tekstu: "+bezRazmaka(data));
		System.out.println("Broj linija u tekstu: "+brojLinija(data));
		
		
		
	}
	
	public static String readFileAsString(String fileName)throws Exception
	  {
	    String data = "";
	    data = new String(Files.readAllBytes(Paths.get("test.txt")));
	    return data;
	  }
	
	 public static int brojRijeci(String str)
	    {
	       int count = 0;
	        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
	        {
	            for (int i = 0; i < str.length(); i++)
	            {
	                if (str.charAt(i) == ' ')
	                {
	                    count++;
	                }
	            }
	            count++; 
	        }
	        return count; // returns 0 if string starts or ends with space " ".
	    }
	 public static int bezRazmaka(String str){
	        int count=0;
	        String space="";
	        String[] words=str.split(space);
	        for(String word:words){
	            if(word.trim().length()>0){
	                count++;
	            }

	        }
	        return count;
	    }
	 private static int brojLinija(String str){
		   String[] lines = str.split("\r\n|\r|\n");
		   return  lines.length;
		}
}
