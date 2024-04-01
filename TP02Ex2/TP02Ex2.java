import java.util.Scanner;

/**
 *
 * @author Eduardo Miranda CB3026604
 */

public class TP02Ex2 {

    /* 2. Entrar via teclado com dez valores positivos. Consistir a digitação e
    enviar mensagem de erro, se necessário. Após a digitação, exibir:
        a. O maior valor;
        b. A soma dos valores;
        c. A média aritmética dos valores.
    * */

        public static void main(String[] args) {
            Scanner entry = new Scanner(System.in);

            int[]values = new int[10];
            int maiorValor = 0;
            int somaValores = 0;

            for (int i = 0; i < values.length; i++) {
                System.out.print("Digite o " + (i + 1) + "º valor positivo: ");
                int value = entry.nextInt();

                if (value < 0) {
                    System.out.print("Valor inválido. Digite um valor positivo: ");
                    i--;
                } else {
                    values[i] = value;

                    if (value > maiorValor) {
                        maiorValor = value;
                    }

                    somaValores += value;
                }
            }

            double mediaAritmetica = (double) somaValores / values.length;

            System.out.println("O maior valor é: " + maiorValor);
            System.out.println("A soma dos valores é: " + somaValores);
            System.out.println("A média aritmética dos valores é: " + mediaAritmetica);
        }
    }





