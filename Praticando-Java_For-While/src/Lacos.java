import java.util.ArrayList;
import java.util.List;
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

    public void calculaFatorial() {
        int fatorial;
        int acumulador = 1;

        System.out.println("Digite a quantidade de fatorial:");
        fatorial = leitura.nextInt();

        for (int i = 1; i <= fatorial; i++) {
            acumulador *= i;
        }

        System.out.println("O fatorial de " + fatorial + " é: " + acumulador);
    }

    public void encontraMaiorNumero() {
        int guardaMaiorNumero = 0;
        List<Integer> valores = new ArrayList<>();

        System.out.println("Digite os números separados por espaço: ");
        for (String s : leitura.nextLine().split(" ")) {
            valores.add(Integer.parseInt(s));
        }

        int i = 1;

        do {
            if (valores.get(i) > guardaMaiorNumero) {
                guardaMaiorNumero = valores.get(i);
            }
            i++;
        } while (i < valores.size());

        System.out.println("Da lista: " + valores + ", o maior número é: " + guardaMaiorNumero);
    }

    public void monitoraSenha() {
        int senha = 1234;
        int tentativaSenha;

        System.out.println("Digite a senha:");
        tentativaSenha = leitura.nextInt();

        for (int i = 1; i < 3; i++) {
            if (tentativaSenha != senha) {
                System.out.println("Senha incorreta! \nDigite a senha novamente: ");
                tentativaSenha = leitura.nextInt();
            } else {
                System.out.println("Senha Correta! Acesso concedido!");
            }
        }
        System.out.println("Sua conta foi bloqueada temporariamente por excesso de tentativas.");
    }

    public void validaNome() {
        String nome;

        System.out.println("Digite seu nome:");
        nome = leitura.nextLine();

        while (nome.length() < 3) {
            System.out.println("Nome inválido. \nDigite novamente:");
            nome = leitura.nextLine();
        }

        System.out.println("Nome " + nome + " cadastrado com sucesso!");
    }
}
