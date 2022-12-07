package ödevlerim;
import java.util.Scanner;
public class Fibo {
							// 1 1 2 3 5 8 13 21 34 55
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Fibonacci dizisinde hangi elemanı istersiniz ? ");
		int sayi = scan.nextInt();
		
		System.out.println(Fibonacci(sayi));
		
	}
	
	public static int Fibonacci(int a) {
		if(a==1 || a==2) {
			return 1;
		}
		else {
			return Fibonacci(a-1)+Fibonacci(a-2);
		}
		
	}
	
	
	
	

}
