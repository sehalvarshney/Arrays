

public class Main {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length, s1 = 0, s2 = 0;

        // Fill the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Main diagonal sum
        for (int i = 0; i < n; i++) {
            s1 += matrix[i][i];
        }

        // Anti-diagonal sum
        for (int i = 0; i < n; i++) {
            s2 += matrix[i][n - 1 - i];
        }

        System.out.println("Main diagonal sum: " + s1);
        System.out.println("Anti-diagonal sum: " + s2);
    }
}

