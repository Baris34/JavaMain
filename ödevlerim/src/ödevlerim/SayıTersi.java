package ödevlerim;
import java.util.Scanner;
public class SayıTersi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayı girin : ");
		int sayi=scan.nextInt();
		int tersi =0; int yedek =sayi;
		
		
		for (; sayi!=0;sayi/=10 ) {
			int basamak = sayi%10;
			tersi=(tersi*10)+basamak;	
		}
		System.out.println("Sayının kendisi = " + yedek + " Sayının tersi ise = " +tersi);
		
	}

}
