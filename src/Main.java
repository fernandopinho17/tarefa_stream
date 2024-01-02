import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        // Lê a lista de pessoas do console
        System.out.println("Digite os dados das pessoas (digite 'fim' para encerrar):");
        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            String sexo = scanner.nextLine();

            pessoas.add(new Pessoa(nome, sexo));
        }

        // Filtra a lista para obter apenas mulheres usando lambda
        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.sexo.equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        // Imprime a lista de mulheres
        System.out.println("\nLista de Mulheres:");
        mulheres.forEach(pessoa -> System.out.println("Nome: " + pessoa.nome + ", Sexo: " + pessoa.sexo));
    }
}
