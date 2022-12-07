package ödevlerim;

public class MatrisYazdırma {
																/*
																 * (15,34,75)
																 * 57,87,93
																 */
																 
	public static void main(String[] args) {
		int[][] matris = {{15,34,75},{51,87,93}};			
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <3; j++) {
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
