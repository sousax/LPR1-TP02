/**
 *
 * @author Eduardo Miranda CB3026604
 */
import java.util.Scanner;

public class TP02Ex9 {

    /*
    9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
    sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
    elementos, calcular e exibir a matriz transposta.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número de linhas (M): ");
        int row = scanner.nextInt();

        System.out.print("Digite o número de colunas (N): ");
        int column = scanner.nextInt();


        if (row > 10 || column > 10) {
            System.out.println("A matriz não pode ser maior que 10x10.");
            return;
        }


        int[][] matriz = new int[row][column];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz Original:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz Transposta:");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}

