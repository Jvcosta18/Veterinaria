import java.util.Scanner;

/**
 * Classe principal do sistema de clínica veterinária.
 */
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro de animais
        int N = 3;
        Animal[] animais = new Animal[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Cadastro do Animal " + (i + 1) + ":");
            System.out.print("Digite o nome do animal: ");
            String nomeAnimal = scanner.nextLine();

            System.out.print("Digite a espécie: ");
            String especie = scanner.nextLine();

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            System.out.print("Digite o histórico: ");
            String historico = scanner.nextLine();

            animais[i] = new Animal(nomeAnimal, especie, idade, historico);
        }

        // Cadastro de tutores
        int T = 2;
        Tutor[] tutores = new Tutor[T];

        for (int i = 0; i < T; i++) {
            System.out.println("Cadastro do Tutor " + (i + 1) + ":");
            System.out.print("Digite o nome do tutor: ");
            String nomeTutor = scanner.nextLine();

            System.out.print("Digite o telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("Digite o endereço: ");
            String endereco = scanner.nextLine();

            tutores[i] = new Tutor(nomeTutor, telefone, endereco);
        }

        System.out.println("Cadastro concluído!");

        // Vincular cada animal a dois tutores
        for (Animal animal : animais) {
            tutores[0].adicionarAnimal(animal);
            tutores[1].adicionarAnimal(animal);
        }

        // Testar listagem
        for (Tutor tutor : tutores) {
            tutor.listarAnimais();
        }

        for (Animal animal : animais) {
            animal.listarTutores();
        }
    }
}
