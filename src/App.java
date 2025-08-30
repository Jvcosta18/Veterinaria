import java.util.Scanner;

/**
 * Classe principal do sistema de clínica veterinária.
 * <p>
 * Este programa permite:
 * <ul>
 *     <li>Cadastrar animais com nome, espécie, idade e histórico.</li>
 *     <li>Cadastrar tutores com nome, telefone e endereço.</li>
 *     <li>Associar animais aos seus tutores.</li>
 *     <li>Testar validações como idade negativa ou telefone vazio.</li>
 * </ul>
 * </p>
 *
 * <p>
 * A documentação das classes {@link Animal} e {@link Tutor} está disponível
 * com detalhes sobre atributos, métodos e exceções.
 * </p>
 */
public class App {

    /**
     * Método principal que executa o sistema de cadastro de animais e tutores.
     *
     * @param args Argumentos da linha de comando (não são utilizados neste programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
            scanner.nextLine(); // Consome quebra de linha

            System.out.print("Digite o histórico: ");
            String historico = scanner.nextLine();

            animais[i] = new Animal(nomeAnimal, especie, idade, historico);
        }

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
    }
}
