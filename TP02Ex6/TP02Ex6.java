/**
 *
 * @author Eduardo Miranda CB3026604
 */

public class TP02Ex6 {

    /*6. Armazenar seis nomes em uma matriz de ordem 2x3.
    Apresentar os nomes na tela.
     */
    public static void main(String[] args) {

        String[][] matriz = new String[2][3];
        matriz[0][0] = "Eduardo";
        matriz[0][1] = "Rafael";
        matriz[0][2] = "Larissa";
        matriz[1][0] = "Eduarda";
        matriz[1][1] = "Yasmin";
        matriz[1][2] = "Jefferson";

        System.out.println("Nomes na matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
