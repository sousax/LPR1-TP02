/**
 *
 * @author Eduardo Miranda CB3026604
 */

public class TP02Ex5 {

    /* 5. Armazenar seis valores em uma matriz de ordem 3x2.
    Apresentar os valores na tela.
     */

    public static void main(String[] args){
        int[][] matriz = new int[3][2];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;

        System.out.println("Valores na matriz 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
}
}}
