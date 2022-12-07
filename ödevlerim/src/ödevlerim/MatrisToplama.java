package ödevlerim;

public class MatrisToplama {

	public static void main(String[] args) {
		int[][] matris1 = {{15,22,34},{37,51,32}};
		int[][] matris2 = {{64,74,98},{20,14,39}};
		
		int[][] matris3 = new int[2][3];
		
		for (int i = 0; i <2; i++) {
			for (int j = 0; j < 3; j++) {
				matris3[i][j] = matris1[i][j] + matris2[i][j];
				
				System.out.print(matris3[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
 	}

}
