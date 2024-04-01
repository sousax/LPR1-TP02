/**
 *
 * @author Eduardo Miranda CB3026604
 */

import java.util.Scanner;
public class TP02Ex11 {

    /* 11. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, dt = 0;

        do {
            System.out.printf("Insira o valor de a da matriz quadrada AxA: ");
            a = scan.nextInt();
        } while(a > 10);

        int[][] mt = new int[a][a];

        for(int i = 0; i < a; ++i) {
            for(int j = 0; j < a; ++j) {
                System.out.printf("Insira o número [%d][%d] da matriz: ", i, j);
                mt[i][j] = scan.nextInt();
            }
        }

        if(a == 1) {
            dt = mt[0][0];
        }
        else {
            int multiplicador = 1;
            int[][] temp = new int[a - 1][a - 1];

            for(int f = 0; f < a; ++f) {
                int g = 0, d = 0;
                for(int i = 1; i < a; ++i) {
                    for(int j = 0; j < a; ++j) {
                        if(j != f) {
                            temp[g][d++] = mt[i][j];
                            if(d == a - 1) {
                                d = 0;
                                g++;
                            }
                        }
                    }
                }
                int subDet = 0;
                for (int i = 0; i < a - 1; ++i) {
                    subDet += temp[0][i] * temp[1][i];
                }
                dt += multiplicador * mt[0][f] * subDet;
                multiplicador = -multiplicador;
            }
        }

        System.out.print("\nMatriz:\n");
        for(int i = 0; i < a; ++i) {
            for(int j = 0; j < a; ++j) {
                System.out.print("|" + mt[i][j] + "|");
            }
            System.out.print("\n");
        }

        System.out.printf("\nDeterminante: %d\n", dt);
    }
}
