/**
 *
 * @author Eduardo Miranda CB3026604
 */

import java.util.Scanner;
public class TP02Ex10 {

    /* 11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
        sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
        calcular e exibir determinante da matriz.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a ordem da matriz (M): ");
        int ordem = scanner.nextInt();
        if (ordem <= 0 || ordem > 10) {
            System.out.println("A ordem da matriz deve ser um número entre 1 e 10.");
            return;
        }
        double[][] matriz = new double[ordem][ordem];
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = scanner.nextDouble();
            }
        }

        double determinante = calcularDeterminante(matriz);
        if (determinante == 0) {
            System.out.println("A matriz não é invertível (determinante é zero).");
            return;
        }
        double[][] inversa = calcularMatrizInversa(matriz, determinante);

        System.out.println("\nMatriz Original:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nMatriz Inversa:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print(inversa[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
    public static double calcularDeterminante(double[][] matriz) {
        int ordem = matriz.length;

        if (ordem == 1) {
            return matriz[0][0];
        }

        double determinante = 0;

        for (int i = 0; i < ordem; i++) {
            double[][] submatriz = new double[ordem - 1][ordem - 1];
            for (int j = 1; j < ordem; j++) {
                for (int k = 0; k < ordem; k++) {
                    if (k < i) {
                        submatriz[j - 1][k] = matriz[j][k];
                    } else if (k > i) {
                        submatriz[j - 1][k - 1] = matriz[j][k];
                    }
                }
            }
            determinante += Math.pow(-1, i) * matriz[0][i] * calcularDeterminante(submatriz);
        }

        return determinante;
    }
    public static double[][] calcularMatrizInversa(double[][] matriz, double determinante) {
        int ordem = matriz.length;
        double[][] adjunta = new double[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                double[][] submatriz = new double[ordem - 1][ordem - 1];
                for (int k = 0; k < ordem; k++) {
                    if (k != i) {
                        for (int l = 0; l < ordem; l++) {
                            if (l != j) {
                                int indiceK = k < i ? k : k - 1;
                                int indiceL = l < j ? l : l - 1;
                                submatriz[indiceK][indiceL] = matriz[k][l];
                            }
                        }
                    }
                }
                double cofator = Math.pow(-1, i + j) * calcularDeterminante(submatriz);
                adjunta[j][i] = cofator / determinante;
            }
        }

        return adjunta;
    }
}
