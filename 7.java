class Problem5 {
    public static void main(String[] args) {
        int matrix [] [] = new int [3] [3];
        int n= matrix.length , m = matrix[0].length;

        for(int i = 0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                matrix[i][j] = (i+1)*(j+1);
            }
        }
        // System.out.println(Arrays.deepToString(matrix));
        //output
        for(int i = 0 ;i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                System.out.print(matrix[i] [j] + " ");
            }
            System.out.println();
        }
    }
    }
}
