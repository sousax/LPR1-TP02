/**
 *
 * @author Eduardo Miranda CB3026604
 */

import java.util.Scanner;
public class TP02Ex8 {

     /*
     8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
    digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
    valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
    correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
    colunas.
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 3, b = 4, mult;
        int[][] mt = new int[a][b];
        int[][] otM = new int[a][b];

        for(int i = 0; i < a; ++i){
            for(int j = 0; j < b; ++j){
                System.out.printf("Insira o número [%d][%d] da matriz: ", i, j);
                mt[i][j] = scan.nextInt();
            }
        }

        System.out.printf("\nInsira um valor multiplicador: ");
        mult = scan.nextInt();

        System.out.println("Matriz Original");
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < b; ++j){
                System.out.print("|" + mt[i][j] + "|");
            }
            System.out.print("\n");
        }
        System.out.println("Matriz com o Multiplicador");
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < b; ++j){
                otM[i][j] = mt[i][j] * mult;
                System.out.print("|" + otM[i][j] + "|");
            }
            System.out.print("\n");
        }

    }



}
