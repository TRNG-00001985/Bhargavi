package revature;
import java.util.Scanner;
public class Matrixmultiply 
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the first matrix: ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();

        System.out.print("Enter the number of rows and columns of the second matrix: ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Number of columns of first matrix must be equal to number of rows of second matrix.");
        return;
        }
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] productMatrix = new int[rows1][cols2];
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Product of the matrices:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
