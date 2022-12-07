package ödevlerim;
import java.util.Scanner;
public class Fakt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Faktöriyelinin hesaplanmasını istediğiniz sayıyı giriniz. ");
		int sayi = scan.nextInt();
		
		int fakt =1;
		
		if(sayi<=10 && sayi>=0) {
		for (int i = 1; i <= sayi; i++) {
			fakt=fakt*i;
		}
		System.out.println(sayi+" sayısının faktöriyeli " + fakt +" dır.");
		}
		
		else {
			System.out.println("Lütfen 0-10 arasında bir sayı giriniz.");
		}
	}

}
