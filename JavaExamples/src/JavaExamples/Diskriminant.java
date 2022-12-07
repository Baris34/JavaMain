package JavaExamples;
import java.util.Scanner;
public class Diskriminant {				//DİSKRİMİNANT B*B-4*A*C     X^2-4X+4    16-4*1*4    -B-SQRT(DİSK)/2A	(x-5)(x-4)  x^2 -9x+20

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir A değeri giriniz : ");
		int A = scan.nextInt();
		System.out.println("Lütfen bir B değeri giriniz : ");
		int B = scan.nextInt();
		System.out.println("Lütfen bir C değeri giriniz : ");
		int C = scan.nextInt();
		
		int disk = (B*B)-(4*A*C);
		
		if(disk<0)
			System.out.println("Reel Kök Yok.");
		
		if(disk==0) {
			int kok=(-B/2*A);
			System.out.println("1 tane kökü var ve o kök " + kok);
		}
		if(disk>0) {
			double kok1, kok2;
			kok1 = ((-1*B)- Math.sqrt(disk))/2*A;
			kok2 =((-1*B)+ Math.sqrt(disk))/2*A;
			System.out.println("kök1 = " +kok1 +" kök2 = "+kok2);
		
	}
	}
}
