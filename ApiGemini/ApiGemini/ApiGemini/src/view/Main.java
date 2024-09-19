package view;

import service.ConsomeApi;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static service.ConsomeApi.fazerPergunta;
import static service.ConsomeApi.formatarResposta;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Fazer uma Pergunta");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

                switch (opcao) {
                    case 1 -> {
                        System.out.println("\nFaça a pergunta: ");
                        String pgt = scanner.nextLine();
                        String resposta = fazerPergunta(pgt);
                        String resp2 = formatarResposta(resposta);
                        System.out.println(resp2);

                    }

                    case 2 -> {
                        System.out.println("\nSaindo...");
                        return;
                    }
                    default -> System.out.println("\nOpção inválida.");
                }

        }
    }
}

