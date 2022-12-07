package ödevlerim;
import java.util.Scanner;
public class HarfBulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kelime Giriniz : ");
		String kelime = scan.nextLine();
		
		for(int i=0;i<kelime.length();i++) {
			char harf = kelime.charAt(i);
			System.out.println(i+". harf "+harf);
		}
		
		
	}

}
