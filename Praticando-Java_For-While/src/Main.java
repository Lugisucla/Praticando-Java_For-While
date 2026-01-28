
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lacos lacos = new Lacos();
        Scanner scanner = new Scanner(System.in);

        String menu = "Digite o número da funcionalidade que deseja testar:\n" +
                "1 - Contagem de degraus\n" +
                "2 - Soma de números\n" +
                "3 - Soma dos números pares\n" +
                "4 - Calculadora de fatorial\n" +
                "5 - Encontrando o maior número\n" +
                "6 - Monitorando tentativas de login\n" +
                "7 - Pedindo um nome válido\n" +
                "8 - Contando números positivos e negativos\n" +
                "9 - Pulando números que terminam em 5\n" +
                "10 - Sistema de controle de acesso a convidados\n" +
                "0 - Sair";

        System.out.println(menu);

        int escolha = -1;

        while (escolha != 0) {

            System.out.println(menu);
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    lacos.contaDegraus();
                    break;
                case 2:
                    lacos.somaNumeros();
                    break;
                case 3:
                    lacos.somaPares();
                    break;
                case 4:
                    lacos.calculaFatorial();
                    break;
                case 5:
                    System.out.println("Não existe nenhuma funcionalidade com esse número no momento!");
                    break;
                case 6:
                    System.out.println("Não existe nenhuma funcionalidade com esse número no momento!");
                    break;
                case 7:
                    System.out.println("Não existe nenhuma funcionalidade com esse número no momento!");
                    break;
                case 8:
                    System.out.println("Não existe nenhuma funcionalidade com esse número no momento!");
                    break;
                case 9:
                    System.out.println("Não existe nenhuma funcionalidade com esse número no momento!");
                    break;
                case 10:
                    System.out.println("Não existe nenhuma funcionalidade com esse número no momento!");
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Não existe nenhuma funcionalidade com esse número!");
            }
        }


    }
}