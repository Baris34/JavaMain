package JavaExamples;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;
public class EnBuyukSayı {

	public static void main(String[] args) {
		//3 tane sayı girilecek .Bu sayılardan hangisinin daha büyük olduğunu bul<
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.Sayıyı giriniz : ");
		double sayi1 = scan.nextDouble();
		System.out.println("2.Sayıyı giriniz : ");
		double sayi2 = scan.nextDouble();
		System.out.println("3.Sayıyı giriniz : ");
		double sayi3 = scan.nextDouble();
		
		if(sayi1>sayi2 && sayi1>sayi3 ) {
			System.out.println("En büyükleri 1.sayıdır.");
			
		}	
		else if (sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("En büyükleri 2.sayıdır.");
			
		}
		else {
			System.out.println("En büyükleri 3.sayıdır.");
		}
		
		
	}

}
