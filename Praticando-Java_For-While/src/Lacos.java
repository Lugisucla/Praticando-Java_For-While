import java.util.Scanner;

public class Lacos {
    Scanner leitura = new Scanner(System.in);

    public void contaDegraus() {
        int degraus;

        System.out.println("Digite a quantidade de degraus:");
        degraus = leitura.nextInt();

        int i = 1;
        while (i <= degraus) {
            System.out.println("Subindo o degrau " + i);
            i++;
        }
    }

    public void somaNumeros() {
        int[] valores = {10, 20, 30, 40, 50};
        int i = 0;
        int soma = 0;

        while (i < valores.length) {
            soma += valores[i];
            i++;
        }
        System.out.println("A soma total das receitas é: " + soma);
    }

    public void somaPares() {
        int soma = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}
