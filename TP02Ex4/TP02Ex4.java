/**
 *
 * @author Eduardo Miranda CB3026604
 */

public class TP02Ex4 {

    /* 4. Armazenar seis valores em uma matriz de ordem 2x3.
    Apresentar os valores na tela.
    */

    public static void main(String[] args) {

        int[][] matriz = new int[2][3];


        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        System.out.println("Valores na matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
