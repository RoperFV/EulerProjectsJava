import java.util.Scanner;
import java.io.File;

class Project11 {
	public static void main(String[] args) throws Exception {
		
		File file = new File("numbers.txt");
		Scanner scanner = new Scanner(file);
		
		int[][] grid = new int [20][20];
		
		for (int i = 0; i<20; i++) {
			for (int j = 0; j<20; j++) {
				grid[i][j] = scanner.nextInt();
				
				
			}
			
			
		}
		
		int endProduct = 0;
		int currProduct = 0;
		
		int c1 = 0;
		int c2 = 1;
		int c3 = 2;
		int c4 = 3;
		for (int i = 0; i<20; i++) {
			for (int j = 0; c4<20; j++) {
				currProduct = grid[i][c1] * grid[i][c2] * grid[i][c3] * grid[i][c4];
				if (currProduct > endProduct) {
					endProduct = currProduct;
				}
				c1++;
				c2++;
				c3++;
				c4++;
				
				
			}
			c1 = 0;
			c2 = 1;
			c3 = 2;
			c4 = 3;
			
		}
		
		
		for (int c = 0; c<20; c++) {
			
			for (int r = 0; c4<20; r++) {
				currProduct = grid[c1][c] * grid[c2][c] * grid[c3][c] * grid[c4][c];
				if (currProduct > endProduct) {
					endProduct = currProduct;
					
				}
				c1++;
				c2++;
				c3++;
				c4++;
				
			}
			c1 = 0;
			c2 = 1;
			c3 = 2;
			c4 = 3;
			
		}
		
		for (int i = 0; i<17; i++) {
			for (int j = 0; c4+i<20; j++) {
				currProduct = grid[c1+i][c1] * grid[c2+i][c2] * grid[c3+i][c3] * grid[c4+i][c4];
				if (currProduct > endProduct) {
					endProduct = currProduct;
				}
				c1++;
				c2++;
				c3++;
				c4++;
				
			}
				
			c1 = 0;
			c2 = 1;
			c3 = 2;
			c4 = 3;
			
		}
		
		
		for (int i = 1; i<17; i++) {
			for (int j = 0; c4+i<20; j++){
				
				currProduct = grid[c1][c1+i] * grid[c2][c2+i] * grid[c3][c3+i] * grid[c4][c4+i];
				if (currProduct > endProduct) {
					endProduct = currProduct;
					
				}
				c1++;
				c2++;
				c3++;
				c4++;
				
			}
			c1 = 0;
			c2 = 1;
			c3 = 2;
			c4 = 3;
			
			
		}
		
		int[][] grid2 = new int[20][20];
		int rowCount = 0;
		int colCount = 0;
		
		for (int i = 19; i>=0; i--) {
			for (int j = 19; j>=0; j--) {
				grid2[i][j] = grid[rowCount][colCount];
				colCount++;
				
				
			}
			rowCount++;
			colCount = 0;
			
			
			
		}
		
		for (int i = 0; i<17; i++) {
			for (int j = 0; c4+i<20; j++) {
				currProduct = grid2[c1+i][c1] * grid2[c2+i][c2] * grid2[c3+i][c3] * grid2[c4+i][c4];
				if (currProduct > endProduct) {
					endProduct = currProduct;
				}
				c1++;
				c2++;
				c3++;
				c4++;
				
			}
				
			c1 = 0;
			c2 = 1;
			c3 = 2;
			c4 = 3;
			
		}
		
		
		for (int i = 1; i<17; i++) {
			for (int j = 0; c4+i<20; j++){
				
				currProduct = grid2[c1][c1+i] * grid2[c2][c2+i] * grid2[c3][c3+i] * grid2[c4][c4+i];
				if (currProduct > endProduct) {
					endProduct = currProduct;
					
				}
				c1++;
				c2++;
				c3++;
				c4++;
				
			}
			c1 = 0;
			c2 = 1;
			c3 = 2;
			c4 = 3;
			
			
		}
		
		
		c1 = 0;
		c2 = 1;
		c3 = 2;
		c4 = 3;
		
		System.out.println(endProduct);
		
	}


}