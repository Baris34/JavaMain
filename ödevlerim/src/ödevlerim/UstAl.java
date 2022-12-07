package ödevlerim;
import java.util.Scanner;
public class UstAl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Taban giriniz . ");
		int taban = scan.nextInt();
		System.out.println("Üs giriniz . ");
		int üs = scan.nextInt();
		
		System.out.println(UstAl(taban,üs));
		
	}
	
	public static int UstAl(int x, int y) {
		
		if(y==0)
			return 1;
		
		else {
			return x*UstAl(x,y-1);
		}
		
		
		
	}
	
	
	

}
