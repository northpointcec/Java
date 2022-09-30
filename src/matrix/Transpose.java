package matrix;

public class Transpose {

	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3},
	              {4, 5, 6},
	              {7, 8, 9}};
		for( int i = 0 ; i<matrix.length; i++) {
			for( int j = 0; j<matrix[0].length; j++) {
				if(j>i) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
			}
		}
		
		 int l = 0;
	        int r = matrix.length-1;
	        while(r>l){
	            for( int i = 0; i<matrix[0].length; i++){
	                int temp = matrix[l][i];
	                matrix[l][i] = matrix[r][i];
	                matrix[r][i] = temp;
	            }
	            l++;
	            r--;
	        }
	        for( int i[]:matrix) {
				for( int j:i) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		
	}
}
